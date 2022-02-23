package com.example.demo.service.payment;

import com.example.demo.entities.Payment;
import com.example.demo.service.GeneralCRUDService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class PaymentServiceImpl implements GeneralCRUDService<Payment>, PaymentService {

    @Override
    public Payment create(Payment payment) {
        return null;
    }

    @Override
    public Optional<Payment> getTicketById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Payment update(Payment payment) {
        return null;
    }

    @Override
    public Payment findByPerson(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Payment> getAllPayments() {
        return null;
    }

    @Override
    public String getPaymentDateByUserId(Long id) {
        return null;
    }

    @Override
    public Long findPaymentByUserId(Long id) {
        return null;
    }

    @Override
    public Payment findPaymentByTDate() {
        return null;
    }

    @Override
    public void deleteByPerson(String firstName, String lastName) {

    }
}
