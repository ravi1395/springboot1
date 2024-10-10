package com.app.application.service;

import com.app.application.NoMatchingPaymentException;
import com.app.application.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PaymentService {
    public List<Payment> getAll();

    //List<Payment> findAllByCountry(String country) throws NoMatchingPaymentException;
    Payment getById(Long id) throws NoMatchingPaymentException;
    Payment addPayment(Payment payment);
}
