package cn.linyt.study.productviewserviceribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateConfig
 * @Description TODO
 * @Author Mojo
 * @Date 2020/4/28 23:58
 * @Version 1.0
 **/
@Component
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
