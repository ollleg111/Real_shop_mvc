package com.example.demo.service.orders;

import com.example.demo.entities.Order;
import com.example.demo.entities.User;

import java.util.List;

public interface OrderService {
    Order findByPerson(String firstName, String lastName);
    List<Order> getAllOrders();
    String getDateByOrderId(Long id);
    Long findOrderByUserIdAndDate(Long id);
    Order findOrderByTodayDate();
    void deleteByPerson(String firstName, String lastName);
}
