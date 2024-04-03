package com.example.pw25s.Ecommerce.service;

import com.example.pw25s.Ecommerce.model.Order;
import com.example.pw25s.Ecommerce.repository.CategoryRepository;
import com.example.pw25s.Ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final com.example.pw25s.Ecommerce.repository.OrderRepository OrderRepository;

    public OrderService(OrderRepository OrderRepository) {
        this.OrderRepository = OrderRepository;
    }

    public Order save(Order order) {
        return OrderRepository.save(order);
    }

    public Order findOne(Long id) {
        return OrderRepository.findById(id).orElse(null);
    }

    public List<Order> findAll() {
        return OrderRepository.findAll();
    }

    public void delete(Long id) {
        OrderRepository.deleteById(id);
    }
}
