package com.mantas.groceries.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record Item(@NotNull int id,
                   @NotNull String name,
                   @NotNull Category category,
                   @NotNull BigDecimal price,
                   @NotNull @Size(max = 99) int amount) {
}
