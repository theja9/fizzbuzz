package com.spring.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public String plainFizzBuzz(int num) {
        if (num % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(num);
    }

}
