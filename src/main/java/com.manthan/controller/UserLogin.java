package com.manthan.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.function.Function;

// this is a post type function where <input, output> datatypes are mentioned in <>
public class UserLogin {
    @Bean
    public Function<String, String> userLogin() {
        return value -> {
            return "Hello " + value;
        };
    }
}
