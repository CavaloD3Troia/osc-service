package org.cavalodetroia.osc.api.sample;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateSampleRequest(@NotBlank @Size(max = 200) String name) {
}
