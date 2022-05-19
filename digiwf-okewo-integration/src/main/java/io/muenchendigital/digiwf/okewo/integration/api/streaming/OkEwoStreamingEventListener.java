package io.muenchendigital.digiwf.okewo.integration.api.streaming;

import io.muenchendigital.digiwf.okewo.integration.api.dto.QueriesDto;
import io.muenchendigital.digiwf.okewo.integration.domain.mapper.QueriesMapper;
import io.muenchendigital.digiwf.okewo.integration.domain.model.QueriesModel;
import io.muenchendigital.digiwf.spring.cloudstream.utils.api.streaming.service.CorrelateMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

@RequiredArgsConstructor
@Slf4j
public class OkEwoStreamingEventListener {

    private static final String RESPONSE = "response";

    private final QueriesMapper queriesMapper;

    private final CorrelateMessageService correlateMessageService;

    @Bean
    public Consumer<Message<QueriesDto>> getParkausweiseByQueries() {
        return message -> {
            log.info(message.toString());

            final QueriesModel model = this.queriesMapper.dto2Model(message.getPayload());

            final Map<String, Object> payload = new HashMap<>();

            /*
            payload.put(
                    RESPONSE,
                    this.parkausweisResponseMapper.model2Dto(this.parkausweisByQuerySearchService.getParkausweiseByQueries(model))
            );
            */

            this.correlateMessageService.sendCorrelateMessage(message.getHeaders(), payload);
        };
    }

}
