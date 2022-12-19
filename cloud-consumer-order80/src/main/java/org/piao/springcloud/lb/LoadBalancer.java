package org.piao.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author：piao
 * @Date：2022/12/13 9:21 PM
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstanceList);
}
