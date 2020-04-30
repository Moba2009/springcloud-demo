package cn.linyt.study.productdataservice.config;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName SamplerConfig
 * @Description TODO    配置 Sampler 抽样策略： ALWAYS_SAMPLE 表示持续抽样
 * @Author Mojo
 * @Date 2020/4/30 0:48
 * @Version 1.0
 **/
@Component
public class SamplerConfig {

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
