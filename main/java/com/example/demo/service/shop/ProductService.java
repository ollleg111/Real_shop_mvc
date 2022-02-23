package com.example.demo.service.shop;

import com.example.demo.entities.Product;

import java.time.LocalDate;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    LocalDate getDateProductRegistration(Long id);
    Long getQuantityByProductId(Long id);
}
