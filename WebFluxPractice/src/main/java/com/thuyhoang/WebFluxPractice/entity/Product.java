package com.thuyhoang.WebFluxPractice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "products")
public class Product {
    @Id
    private String id;

    private String name;

    private int qty;

    private double price;
}
