package com.generation.brainless.webapp01.config;

import com.generation.brainless.webapp01.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public TestBean testBean() {
        return new TestBean("Hello");
    }

}