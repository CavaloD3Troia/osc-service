package org.cavalodetroia.osc.application.wiring;

import org.cavalodetroia.osc.domain.sample.SampleService;
import org.cavalodetroia.osc.domain.sample.port.out.SamplePublisher;
import org.cavalodetroia.osc.domain.sample.port.out.SampleRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleWiring {

    @Bean
    public SampleService sampleService(final SampleRepository sampleRepository, final SamplePublisher samplePublisher) {
        return new SampleService(sampleRepository, samplePublisher);
    }
}
