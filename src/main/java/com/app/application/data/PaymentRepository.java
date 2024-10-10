package com.app.application.data;

import com.app.application.NoMatchingPaymentException;
import com.app.application.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {


}
