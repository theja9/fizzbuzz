package com.spring.fizzbuzz.service;

import com.spring.fizzbuzz.model.FizzBuzzRequest;
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

    @Test
    public void testBuzzDivisibleBy5(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.plainFizzBuzz(5);
        assertEquals("buzz", actualResult);
    }

    @Test
    public void testFizzBuzz(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.plainFizzBuzz(15);
        assertEquals("fizz buzz", actualResult);
    }

    //fizzBuzzPop
    @Test
    public void testPop(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.fizzBuzzPop(28);
        assertEquals("pop", actualResult);
    }

    @Test
    public void testFizzPop(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.fizzBuzzPop(63);
        assertEquals("fizz pop", actualResult);
    }

    @Test
    public void testBuzzPop(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.fizzBuzzPop(70);
        assertEquals("buzz pop", actualResult);
    }

    @Test
    public void testFizzBuzzPop(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.fizzBuzzPop(210);
        assertEquals("fizz buzz pop", actualResult);
    }

    //feature3: customFizzBuzz
    public void testFuzz(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.customFizzBuzz(request(),4);
        assertEquals("fuzz", actualResult);
    }

    @Test
    public void testBizz(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.customFizzBuzz(request(),9);
        assertEquals("bizz", actualResult);
    }

    @Test
    public void testFuzzBizz(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.customFizzBuzz(request(),12);
        assertEquals("fuzz bizz", actualResult);
    }

    public FizzBuzzRequest request(){
        return new FizzBuzzRequest(2,3,"fuzz","bizz");
    }



}
