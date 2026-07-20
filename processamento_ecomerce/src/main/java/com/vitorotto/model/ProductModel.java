package com.vitorotto.model;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductModel {

    private final int id;
    private String name;
    private String category;
    private BigDecimal price;
    private int stock;

    public ProductModel(int id, String name, String category, BigDecimal price, int stock) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int quant) {
        if (quant <= 0)
            throw new IllegalArgumentException("The value must be positive");
        else
            this.stock += quant;
    }

    public void subStock(int quant) {
        if (quant <= 0)
            throw new IllegalArgumentException("The value must be positive");
        if (quant > this.stock)
            throw new IllegalArgumentException("The value must be low than " + this.stock);
        else
            this.stock -= quant;
    }

    @Override
    public String toString() {
        return "ProductModel [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", stock="
                + stock + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ProductModel other = (ProductModel) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
