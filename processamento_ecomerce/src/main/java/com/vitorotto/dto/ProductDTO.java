package com.vitorotto.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDTO {
    private final int id;
    private final String name;
    private final String category;
    private final double price;
    private final int stock;

    @JsonCreator
    public ProductDTO(
        @JsonProperty("id")
        int id,
        @JsonProperty("nome")
        String name,
        @JsonProperty("categoria")
        String category,
        @JsonProperty("preco")
        double price,
        @JsonProperty("estoque")
        int stock
    ) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

}
