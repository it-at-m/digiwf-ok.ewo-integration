package io.muenchendigital.digiwf.okewo.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
public class OkEwoIntegrationApplication {

    public static void main(final String[] args) {
        SpringApplication.run(OkEwoIntegrationApplication.class, args);
    }

}
