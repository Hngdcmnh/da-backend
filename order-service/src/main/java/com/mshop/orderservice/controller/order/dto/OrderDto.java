package com.mshop.orderservice.controller.order.dto;

import com.mshop.orderservice.controller.payment.dto.PaymentInfoDto;
import com.mshop.orderservice.repository.entity.order.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private String orderId;
    private String cartId;
    private PaymentInfoDto payment;
    private PromotionDto promotion;
    private UserDto user;
    private OrderStatus status;
    private String address;
    private Double totalPrice, totalPromotionPrice, finalPrice, totalShipmentPrice;
    private LocalDateTime createdAt;
    private List<OrderCartProductDto> cartProducts;
}
