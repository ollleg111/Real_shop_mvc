package com.example.demo.service.payment;

import com.example.demo.entities.Payment;

import java.util.List;

public interface PaymentService {
    Payment findByPerson(String firstName, String lastName);
    List<Payment> getAllPayments();
    String getPaymentDateByUserId(Long id);
    Long findPaymentByUserId(Long id);
    Payment findPaymentByTDate();
    void deleteByPerson(String firstName, String lastName);
}
