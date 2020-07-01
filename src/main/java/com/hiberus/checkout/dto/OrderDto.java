package com.hiberus.checkout.dto;

import java.util.Arrays;
import java.util.Date;

public class OrderDto {

    private int clientId;
    private Date date;
    private String direction;
    private ProductDto[] products;

    public OrderDto() {
    }

    public OrderDto(int clientId, Date date, String direction, ProductDto[] products) {
        this.clientId = clientId;
        this.date = date;
        this.direction = direction;
        this.products = products;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ProductDto[] getProducts() {
        return products;
    }

    public void setProducts(ProductDto[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "clientId=" + clientId +
                ", date=" + date +
                ", direction='" + direction + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
