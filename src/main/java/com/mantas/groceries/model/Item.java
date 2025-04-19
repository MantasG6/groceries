package com.mantas.groceries.model;

import java.math.BigDecimal;

public record Item(int id, String name, Category category, BigDecimal price) {
}
