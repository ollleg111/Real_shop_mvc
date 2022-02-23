package com.example.demo.service;

import java.util.Optional;

public interface GeneralCRUDService<T> {
    T create(T t);
    Optional<T> getTicketById(Long id);
    void deleteById(Long id);
    T update(T t);
}
