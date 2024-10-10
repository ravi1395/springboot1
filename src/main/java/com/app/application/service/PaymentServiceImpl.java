package com.app.application.service;

import com.app.application.NoMatchingPaymentException;
import com.app.application.data.PaymentRepository;
import com.app.application.model.Payment;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository repo;

    private Logger log = LoggerFactory.getLogger(PaymentServiceImpl.class);


    NoMatchingPaymentException exception = new NoMatchingPaymentException("not found");
    @Override
    public List<Payment> getAll() {

        log.info("get All was called ");
        return repo.findAll();
    }

//    @Override
//    public List<Payment> findAllByCountry(String country) throws NoMatchingPaymentException {
//        return List.of();
//    }

    public Payment getById(Long id) throws NoMatchingPaymentException{
            return repo.findById(id).orElseThrow(() -> {
                log.error("getById - No match found");
                return new NoMatchingPaymentException("not found");
            });

    }

    @Override
    @Transactional
    public Payment addPayment(Payment payment) {
        return repo.save(payment);
    }

//    public  List<Payment> getPaymentByCountry(String country) throws NoMatchingPaymentException{
//        return repo.findBy()
//    }
}
