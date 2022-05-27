package io.muenchendigital.digiwf.okewo.integration.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(
        scanBasePackages = {
                "io.muenchendigital.digiwf.okewo.integration",
                "io.muenchendigital.digiwf.spring.cloudstream.utils"
        }
)
public class OkEwoIntegrationApplication {

    public static void main(final String[] args) {
        SpringApplication.run(OkEwoIntegrationApplication.class, args);
    }

}
