package com.example.demo.service.shop;

import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.service.GeneralCRUDService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class ProductServiceImpl implements GeneralCRUDService<User>, ProductService {

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public Optional<User> getTicketById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public LocalDate getDateProductRegistration(Long id) {
        return null;
    }

    @Override
    public Long getQuantityByProductId(Long id) {
        return null;
    }
}
