package org.cavalodetroia.osc.api.sample;

import org.cavalodetroia.osc.domain.sample.Sample;
import org.springframework.stereotype.Component;

@Component
public class SampleConverter {

    public SampleResponse toResponse(final Sample sample) {
        return new SampleResponse(sample.id(), sample.name());
    }
}
