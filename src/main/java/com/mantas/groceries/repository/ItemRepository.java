package com.mantas.groceries.repository;

import com.mantas.groceries.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
