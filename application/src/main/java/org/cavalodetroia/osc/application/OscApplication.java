package org.cavalodetroia.osc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Composition root. The domain has no annotations, so it is built by hand in {@code wiring}; the adapters in api
 * and infra are picked up by component scan.
 */
@SpringBootApplication(scanBasePackages = {
        "org.cavalodetroia.osc.application",
        "org.cavalodetroia.osc.api",
        "org.cavalodetroia.osc.infra"})
public class OscApplication {

    public static void main(final String[] args) {
        SpringApplication.run(OscApplication.class, args);
    }
}
