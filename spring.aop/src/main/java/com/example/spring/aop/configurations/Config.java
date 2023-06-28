package com.example.spring.aop.configurations;

import com.example.spring.aop.aspects.TimeItAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = {"com.example.spring.aop.aspects", "com.example.spring.aop.annotations", "com.example.spring.aop.services"})
public class Config {

}
