package com.example.shopping.repository;

import com.example.shopping.entity.Order;
import org.springframework.stereotype.Repository;


public interface OrderRepository {
    void insert(Order order);
}
