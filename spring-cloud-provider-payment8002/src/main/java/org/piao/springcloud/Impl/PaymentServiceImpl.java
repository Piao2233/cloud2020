package org.piao.springcloud.Impl;

import org.piao.springcloud.dao.PaymentDao;
import org.piao.springcloud.entities.Payment;
import org.piao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author：piao
 * @Date：2022/12/6 9:06 PM
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    //// spring的依赖注入注解
    //@Autowired

    // Java自带的依赖注入注解
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }


    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
