package com.mshop.orderservice.repository;

import com.mshop.orderservice.repository.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> getOrdersBySupplierId(String supplierId);
    List<Order> getOrdersByUserId(String userId);

    List<Order> getOrdersByCartId(String cartId);


    List<Order> getOrderBySupplierId(String supplierId);

}
