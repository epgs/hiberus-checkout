package com.hiberus.checkout.dto;

import java.util.Date;

public class CheckoutProcessResponseDto {

    private int clientId;
    private Date date;
    private String direction;
    private double total;
    private String orderStatus;

    public CheckoutProcessResponseDto() {
    }

    public CheckoutProcessResponseDto(int clientId, Date date, String direction, double total, String orderStatus) {
        this.clientId = clientId;
        this.date = date;
        this.direction = direction;
        this.total = total;
        this.orderStatus = orderStatus;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }


}
