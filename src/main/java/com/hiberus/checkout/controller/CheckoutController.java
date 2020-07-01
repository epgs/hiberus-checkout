package com.hiberus.checkout.controller;

import com.hiberus.checkout.dto.CheckoutProcessResponseDto;
import com.hiberus.checkout.dto.OrderDto;
import com.hiberus.checkout.service.interfaces.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    @Autowired
    CheckoutService checkoutService;

    @PostMapping
    @ResponseBody
    public CheckoutProcessResponseDto checkoutProcess(@RequestBody OrderDto order){
        order.setDate(new Date());
        return checkoutService.checkoutProcess(order);
    }
}
