package com.thuyhoang.WebFluxPractice.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private String id;

    private String name;

    private int qty;

    private double price;
}
