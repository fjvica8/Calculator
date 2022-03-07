package com.calculator.calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.corp.calculator.TracerImpl;

@Configuration
public class TracerConfig {
	
	@Bean
    public TracerImpl startTracerImpl(){
        return new TracerImpl();
    }
	
}
