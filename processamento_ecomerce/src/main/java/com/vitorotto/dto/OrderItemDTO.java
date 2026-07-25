package com.vitorotto.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderItemDTO {
    
    private final int productId;
    private final int quantity;

    @JsonCreator
    public OrderItemDTO(
        @JsonProperty("produtoId")
        int productId,
        @JsonProperty("quantidade")
        int quantity
    ) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

}
