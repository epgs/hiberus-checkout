package com.hiberus.checkout.dto;

public class BillProcessResponseDto {

    private double total;

    public BillProcessResponseDto() {
    }

    public BillProcessResponseDto(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BillProcessResponseDto{" +
                "total=" + total +
                '}';
    }
}
