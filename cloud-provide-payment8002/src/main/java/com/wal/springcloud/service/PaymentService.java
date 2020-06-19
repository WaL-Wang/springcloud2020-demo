package com.wal.springcloud.service;

import com.wal.commons.entity.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
