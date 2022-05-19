package io.muenchendigital.digiwf.okewo.integration.configuration;

import io.muenchendigital.digiwf.okewo.integration.properties.OkEwoIntegrationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@RequiredArgsConstructor
@ComponentScan(basePackages = "io.muenchendigital.digiwf.okewo.integration")
@EnableConfigurationProperties(OkEwoIntegrationProperties.class)
public class OkEwoIntegrationAutoConfiguration {

    public final OkEwoIntegrationProperties okEwoIntegrationProperties;

}
