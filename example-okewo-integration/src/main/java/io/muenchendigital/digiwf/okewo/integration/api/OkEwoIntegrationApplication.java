package io.muenchendigital.digiwf.okewo.integration.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class OkEwoIntegrationApplication {

    public static void main(final String[] args) {
        SpringApplication.run(OkEwoIntegrationApplication.class, args);
    }

}
