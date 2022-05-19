package io.muenchendigital.digiwf.okewo.integration.configuration;

import io.muenchendigital.digiwf.okewo.integration.gen.ApiClient;
import io.muenchendigital.digiwf.okewo.integration.properties.OkEwoIntegrationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;


@RequiredArgsConstructor
@ComponentScan(
        basePackages = "io.muenchendigital.digiwf.okewo.integration",
        excludeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        classes = {
                                /**
                                 * Exclude to avoid multiple instantiation of beans with same name.
                                 * This class is instantiated in {@link OkEwoIntegrationAutoConfiguration}
                                 * to give the bean another name.
                                 */
                                ApiClient.class,
                        }
                )
        }
)
@EnableConfigurationProperties(OkEwoIntegrationProperties.class)
public class OkEwoIntegrationAutoConfiguration {

    public final OkEwoIntegrationProperties okEwoIntegrationProperties;

    @Bean
    public ApiClient okEwoApiClient(final RestTemplateBuilder restTemplateBuilder) {
        final RestTemplate restTemplate = restTemplateBuilder
                .basicAuthentication(
                        this.okEwoIntegrationProperties.getUsername(),
                        this.okEwoIntegrationProperties.getPassword()
                )
                .build();
        final ApiClient apiClient = new ApiClient(restTemplate);
        apiClient.setBasePath(this.okEwoIntegrationProperties.getUrl());
        return apiClient;
    }

}
