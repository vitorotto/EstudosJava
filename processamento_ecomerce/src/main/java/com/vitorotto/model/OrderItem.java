package com.vitorotto.model;

import java.util.Objects;

public class OrderItem {

    private final ProductModel product;
    private int quantity;
    
    public OrderItem(ProductModel product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }  

    public ProductModel getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("The value must be positive");
        else
            this.quantity += quantity;
    }

    public void subQuantity(int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("The value must be positive");
        if (quantity > this.quantity)
            throw new IllegalArgumentException("The value must be low than " + this.quantity);
        else
            this.quantity -= quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product.getId());
    } 

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItem other = (OrderItem) obj;
        if (!product.equals(other.product))
            return false;
        return true;
    }

}
