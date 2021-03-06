package org.mulan.cloud2020demo.service;

import org.mulan.cloud2020demo.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

	int create(Payment payment);

	Payment getPaymentById(@Param("id") Long id);
}
