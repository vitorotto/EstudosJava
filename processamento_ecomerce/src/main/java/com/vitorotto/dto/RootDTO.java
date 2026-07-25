package com.vitorotto.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RootDTO {
    private final List<ClientDTO> clientList;
    private final List<ProductDTO> productList;
    private final List<OrderDTO> orderList;

    @JsonCreator
    public RootDTO(
        @JsonProperty("clientes")
        List<ClientDTO> clientList,
        @JsonProperty("produtos")
        List<ProductDTO> productList,
        @JsonProperty("pedidos")
        List<OrderDTO> orderList
    ) {
        this.clientList = clientList;
        this.productList = productList;
        this.orderList = orderList;

    }

    public List<ClientDTO> getClientList() {
        return clientList;
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public List<OrderDTO> getOrderList() {
        return orderList;
    }

}
