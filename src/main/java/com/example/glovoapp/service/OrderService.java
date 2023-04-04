package com.example.glovoapp.service;

import com.example.glovoapp.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class OrderService {

    private final List<Order> orders = new ArrayList<>();

    public Order getOrderById(Long id) {
        for (Order order : orders) {
            if (Objects.equals(order.getId(), id)) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

}
