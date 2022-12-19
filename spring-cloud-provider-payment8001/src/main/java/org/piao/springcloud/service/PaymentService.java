package org.piao.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.piao.springcloud.entities.Payment;

/**
 * @Author：piao
 * @Date：2022/12/6 9:05 PM
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
