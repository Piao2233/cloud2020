package org.piao.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.piao.springcloud.entities.Payment;

/**
 * @Author：piao
 * @Date：2022/12/6 8:30 PM
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
