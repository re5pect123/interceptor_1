package com.interceptor.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyInterceptorRegistry extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors (InterceptorRegistry registy){
        registy.addInterceptor(new MyInterceptor());
    }
}
