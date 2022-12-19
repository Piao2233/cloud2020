package org.piao.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author：piao
 * @Date：2022/12/12 10:07 PM
 */
@Component
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
