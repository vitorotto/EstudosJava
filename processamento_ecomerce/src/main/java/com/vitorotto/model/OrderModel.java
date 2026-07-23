package com.vitorotto.model;

import com.vitorotto.model.enums.OrderStatus;
import com.vitorotto.model.enums.PaymentMethod;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class OrderModel {
    
    private final int id;
    private final ClientModel client;
    private final LocalDate date;
    private final PaymentMethod paymentMethod;
    private final List<OrderItemModel> items;
    private OrderStatus status;

    public OrderModel (
        int id,
        ClientModel client,
        LocalDate date,
        PaymentMethod paymentMethod,
        List<OrderItemModel> items,
        OrderStatus status
    ) {
        this.id = id;
        this.client = client;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.items = List.copyOf(items);
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public ClientModel getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void cancelOrder() {
        if (this.status == OrderStatus.CANCELADO)
            throw new IllegalStateException("This order has already been canceled");
        else
            this.status = OrderStatus.CANCELADO;
    }

    public void setAsPaid() {
        if (this.status == OrderStatus.CANCELADO)
            throw new IllegalStateException("This order cannot be paid, it has already been cancelled.");
        else if (this.status == OrderStatus.PAGO)
            throw new IllegalStateException("This order has already been paid");
        else
            this.status = OrderStatus.PAGO;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public List<OrderItemModel> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "OrderModel [id=" + id + ", client=" + client.getName() + ", date=" + date + ", status=" + status
                + ", paymentMethod=" + paymentMethod + ", items=" + items + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderModel other = (OrderModel) obj;
        return id == other.id;
    }

}
