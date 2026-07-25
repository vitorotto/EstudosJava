package com.vitorotto.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDTO {
    private final int id;
    private final int clientId;
    private final LocalDate date;
    private final String paymentMethod;
    private final List<OrderItemDTO> items;
    private final String status;

    @JsonCreator
    public OrderDTO(
        @JsonProperty("id")
        int id,
        @JsonProperty("clienteId")
        int clientId,
        @JsonProperty("data")
        LocalDate date,
        @JsonProperty("formaPagamento")
        String paymentMethod,
        @JsonProperty("itens")
        List<OrderItemDTO> items,      
        @JsonProperty("status")
        String status
    ) {
        this.id = id;
        this.clientId = clientId;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.items = items;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public List<OrderItemDTO> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

}
