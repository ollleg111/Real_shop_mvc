package com.example.demo.service.orders;

import com.example.demo.entities.Order;
import com.example.demo.service.GeneralCRUDService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class OrderServiceImpl implements GeneralCRUDService<Order>, OrderService {

    @Override
    public Order create(Order order) {
        return null;
    }

    @Override
    public Optional<Order> getTicketById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public Order findByPerson(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public String getDateByOrderId(Long id) {
        return null;
    }

    @Override
    public Long findOrderByUserIdAndDate(Long id) {
        return null;
    }

    @Override
    public Order findOrderByTodayDate() {
        return null;
    }

    @Override
    public void deleteByPerson(String firstName, String lastName) {

    }
}
