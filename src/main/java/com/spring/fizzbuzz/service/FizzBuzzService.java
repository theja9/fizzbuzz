package com.spring.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public String plainFizzBuzz(int num) {
        return String.valueOf(num);
    }

}
