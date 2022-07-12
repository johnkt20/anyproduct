package com.yohannes.anyproduct.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Congfigurations {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
