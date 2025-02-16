package com.example.shopping.repository;

import com.example.shopping.entity.OrderItem;
import org.springframework.stereotype.Repository;


public interface OrderItemRepository {
    void insert(OrderItem orderItem);
}
