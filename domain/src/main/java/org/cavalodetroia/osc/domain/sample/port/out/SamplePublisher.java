package org.cavalodetroia.osc.domain.sample.port.out;

import org.cavalodetroia.osc.domain.sample.Sample;

/**
 * Tells the rest of the platform that a sample was created.
 */
public interface SamplePublisher {

    void publish(Sample sample);
}
