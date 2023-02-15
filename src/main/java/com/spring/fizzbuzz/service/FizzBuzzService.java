package com.spring.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public String plainFizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizz buzz";
        }
        if (num % 3 == 0) {
            return "fizz";
        }
        if (num % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(num);
    }

    public String fizzBuzzPop(int num) {
        if (num % 3 == 0 && num % 7 == 0) {
            return "fizz pop";
        }
        if (num % 7 == 0) {
            return "pop";
        }
        return String.valueOf(num);
    }

}
