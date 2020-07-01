package com.hiberus.checkout.service.interfaces;

import com.hiberus.checkout.dto.CheckoutProcessResponseDto;
import com.hiberus.checkout.dto.OrderDto;

public interface CheckoutService {

    public CheckoutProcessResponseDto checkoutProcess(OrderDto order);
}
