package com.spring.fizzbuzz.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {
    private FizzBuzzService service;

    @BeforeEach
    public void setup() {
        service = new FizzBuzzService();
    }

    @Test
    public void testNumber() {
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.plainFizzBuzz(1);
        assertEquals("1", actualResult);
    }

    //feature-1: PlainFizzBuzz
    @Test
    public void testFizz(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.plainFizzBuzz(3);
        assertEquals("fizz", actualResult);
    }

    @Test
    public void testFizzDivisibleBy3(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.plainFizzBuzz(9);
        assertEquals("fizz", actualResult);
    }
}
