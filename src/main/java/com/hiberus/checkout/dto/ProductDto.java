package com.hiberus.checkout.dto;

public class ProductDto {

    private int id;
    private int quantity;
    private double cost;

    public ProductDto() {
    }

    public ProductDto(int id, int quantity, double cost) {
        this.id = id;
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
