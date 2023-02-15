package com.spring.fizzbuzz.service;

import com.spring.fizzbuzz.model.FizzBuzzRequest;
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
        if(num%3 == 0 && num%5 ==0 && num%7==0)
            return "fizz buzz pop";

        if (num % 3 == 0 && num % 7 == 0) {
            return "fizz pop";
        }
        if (num % 5 == 0 && num % 7 == 0) {
            return "buzz pop";
        }
        if (num % 7 == 0) {
            return "pop";
        }
        return String.valueOf(num);
    }

    public String customFizzBuzz(FizzBuzzRequest request, int num) {
        if (num % request.getNum1() == 0 && num % request.getNum2() == 0) {
            return request.getKeyword1() + " "+ request.getKeyword2();
        }
        if (num % request.getNum1() == 0) {
            return request.getKeyword1();
        }
        if (num % request.getNum2() == 0) {
            return request.getKeyword2();
        }
        return String.valueOf(num);
    }


}
