package io.muenchendigital.digiwf.okewo.integration.api.streaming;

import io.muenchendigital.digiwf.okewo.integration.api.dto.OkEwoErrorDto;
import io.muenchendigital.digiwf.okewo.integration.api.dto.OrdnungsmerkmalDto;
import io.muenchendigital.digiwf.okewo.integration.gen.model.BenutzerType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.Person;
import io.muenchendigital.digiwf.okewo.integration.gen.model.PersonErweitert;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonAnfrage;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonAntwort;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonerweitertAnfrage;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonerweitertAntwort;
import io.muenchendigital.digiwf.okewo.integration.repository.OkEwoPersonErweitertRepository;
import io.muenchendigital.digiwf.okewo.integration.repository.OkEwoPersonRepository;
import io.muenchendigital.digiwf.spring.cloudstream.utils.api.streaming.service.CorrelateMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.Map;
import java.util.function.Consumer;

@RequiredArgsConstructor
@Slf4j
public class OkEwoStreamingEventListener {

    private static final String RESPONSE = "response";

    private final CorrelateMessageService correlateMessageService;

    private final OkEwoPersonRepository okEwoPersonRepository;

    private final OkEwoPersonErweitertRepository okEwoPersonErweitertRepository;

    @Value("${io.muenchendigital.digiwf.okewo.benutzerId}")
    private String benutzerId;

    /**
     * The Consumer expects an {@link OrdnungsmerkmalDto} which represents an "om" for OK.EWO.
     * <p>
     * After successfully requesting OK.EWO a JSON representing a {@link Person} is returned.
     * <p>
     * In case of an error the error message is returned as a JSON representing {@link OkEwoErrorDto}.
     */
    @Bean
    public Consumer<Message<OrdnungsmerkmalDto>> getPerson() {
        return message -> {
            log.debug(message.toString());

            final OrdnungsmerkmalDto ordnungsmerkmal = message.getPayload();

            Object ewoResult;
            try {
                ewoResult = this.okEwoPersonRepository.getPerson(ordnungsmerkmal.getOm(), this.benutzerId);
            } catch (final Exception exception) {
                ewoResult = new OkEwoErrorDto(exception.getMessage());
            }

            this.correlateMessageService.sendCorrelateMessage(
                    message.getHeaders(),
                    Map.of(RESPONSE, ewoResult)
            );
        };
    }

    /**
     * The Consumer expects a {@link SuchePersonAnfrage} which represents the request dto for OK.EWO.
     * <p>
     * After successfully requesting OK.EWO a JSON representing a {@link SuchePersonAntwort} is returned.
     * <p>
     * In case of an error the error message is returned as a JSON representing {@link OkEwoErrorDto}.
     */
    @Bean
    public Consumer<Message<SuchePersonAnfrage>> searchPerson() {
        return message -> {
            log.debug(message.toString());

            final SuchePersonAnfrage suchePersonAnfrage = message.getPayload();
            final BenutzerType benutzerType = new BenutzerType();
            benutzerType.setBenutzerId(this.benutzerId);
            suchePersonAnfrage.setBenutzer(benutzerType);

            Object ewoResult;
            try {
                ewoResult = this.okEwoPersonRepository.searchPerson(suchePersonAnfrage);
            } catch (final Exception exception) {
                ewoResult = new OkEwoErrorDto(exception.getMessage());
            }

            this.correlateMessageService.sendCorrelateMessage(
                    message.getHeaders(),
                    Map.of(RESPONSE, ewoResult)
            );
        };
    }

    /**
     * The Consumer expects an {@link OrdnungsmerkmalDto} which represents an "om" for OK.EWO.
     * <p>
     * After successfully requesting OK.EWO a JSON representing a {@link PersonErweitert} is returned.
     * <p>
     * In case of an error the error message is returned as a JSON representing {@link OkEwoErrorDto}.
     */
    @Bean
    public Consumer<Message<OrdnungsmerkmalDto>> getPersonErweitert() {
        return message -> {
            log.debug(message.toString());

            final OrdnungsmerkmalDto ordnungsmerkmal = message.getPayload();

            Object ewoResult;
            try {
                ewoResult = this.okEwoPersonErweitertRepository.getPerson(ordnungsmerkmal.getOm(), this.benutzerId);
            } catch (final Exception exception) {
                ewoResult = new OkEwoErrorDto(exception.getMessage());
            }

            this.correlateMessageService.sendCorrelateMessage(
                    message.getHeaders(),
                    Map.of(RESPONSE, ewoResult)
            );
        };
    }

    /**
     * The Consumer expects a {@link SuchePersonerweitertAnfrage} which represents the request dto for OK.EWO.
     * <p>
     * After successfully requesting OK.EWO a JSON representing a {@link SuchePersonerweitertAntwort} is returned.
     * <p>
     * In case of an error the error message is returned as a JSON representing {@link OkEwoErrorDto}.
     */
    @Bean
    public Consumer<Message<SuchePersonerweitertAnfrage>> searchPersonErweitert() {
        return message -> {
            log.debug(message.toString());

            final SuchePersonerweitertAnfrage suchePersonerweitertAnfrage = message.getPayload();
            final BenutzerType benutzerType = new BenutzerType();
            benutzerType.setBenutzerId(this.benutzerId);
            suchePersonerweitertAnfrage.setBenutzer(benutzerType);

            Object ewoResult;
            try {
                ewoResult = this.okEwoPersonErweitertRepository.searchPerson(suchePersonerweitertAnfrage);
            } catch (final Exception exception) {
                ewoResult = new OkEwoErrorDto(exception.getMessage());
            }

            this.correlateMessageService.sendCorrelateMessage(
                    message.getHeaders(),
                    Map.of(RESPONSE, ewoResult)
            );
        };
    }

}
