package com.example.glovoapp.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

import java.util.List;

@Data
public class Order {
    public Long id;
    private LocalDate date;
    private BigDecimal cost;
    private List<Product> products;

    public Order(Long id, LocalDate date, List<Product> products) {
        this.id = id;
        this.date = date;
        this.products = products;
        this.cost = calculateCost();
    }
    private BigDecimal calculateCost(){
        return products.stream().map(Product::getCost).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
