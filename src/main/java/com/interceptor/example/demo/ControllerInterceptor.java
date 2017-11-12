package com.interceptor.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerInterceptor.class);


    @GetMapping("/home")
    public String home(){
        LOGGER.info("USAO U KONTROLER");
        return "home";
    }
}
