package com.example.demo.exceptions;

import org.hibernate.HibernateException;

public class NotFoundException extends HibernateException {
    public NotFoundException(String message) {
        super(message);
    }
}
