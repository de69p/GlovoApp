package com.example.glovoapp.model;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

    private Long id;

    private String name;

    private BigDecimal cost;
}
