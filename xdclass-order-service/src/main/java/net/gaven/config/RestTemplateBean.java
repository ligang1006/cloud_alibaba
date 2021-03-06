package net.gaven.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author: lee
 * @create: 2021/7/23 9:25 上午
 **/
@Component
public class RestTemplateBean {
    //@LoadBalanced,Ribbon负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
