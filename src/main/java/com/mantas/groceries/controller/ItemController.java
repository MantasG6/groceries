package com.mantas.groceries.controller;

import com.mantas.groceries.model.Category;
import com.mantas.groceries.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ItemController {

    @GetMapping("/api/v1/items")
    public Item items() {
        return new Item(1, "Apple", Category.FRUIT, BigDecimal.valueOf(1.25), 10);
    }

}
