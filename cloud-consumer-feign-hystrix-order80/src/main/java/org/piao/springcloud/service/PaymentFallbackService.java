package org.piao.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author：piao
 * @Date：2022/12/18 9:09 AM
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    /**
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---------PaymentFallbackService fall back-paymentInfo_OK, ♡o(╥﹏╥)o ♥♡";
    }

    /**
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---------PaymentFallbackService fall back-paymentInfo_TimeOut, ♡o(╥﹏╥)o ♥♡";
    }
}
