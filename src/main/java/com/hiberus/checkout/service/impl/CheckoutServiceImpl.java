package com.hiberus.checkout.service.impl;

import com.hiberus.checkout.dto.*;
import com.hiberus.checkout.service.interfaces.CheckoutService;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    public CheckoutProcessResponseDto checkoutProcess(OrderDto order){

        CheckoutProcessResponseDto checkoutProcessResponseDto = new CheckoutProcessResponseDto();

        RestTemplate billTemplate = new RestTemplate();
        HttpEntity<ProductDto[]> billRequest = new HttpEntity<>(order.getProducts());
        BillProcessResponseDto billProcessResponseDto = billTemplate.postForObject("http://localhost:9091/bill", billRequest, BillProcessResponseDto.class);

        RestTemplate logisticTemplate = new RestTemplate();
        HttpEntity<OrderDto> logisticRequest = new HttpEntity<>(order);
        LogisticProcessResponseDto logisticProcessResponseDto = logisticTemplate.postForObject("http://localhost:9092/logistic", logisticRequest, LogisticProcessResponseDto.class);

        checkoutProcessResponseDto.setClientId(order.getClientId());
        checkoutProcessResponseDto.setDate(order.getDate());
        checkoutProcessResponseDto.setDirection(order.getDirection());
        checkoutProcessResponseDto.setTotal(billProcessResponseDto.getTotal());
        checkoutProcessResponseDto.setOrderStatus(logisticProcessResponseDto.getStatus());

        return checkoutProcessResponseDto;
    }

}
