package com.spring.fizzbuzz.controller;

import com.spring.fizzbuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
public class fizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @GetMapping("/{variation}/{num}")
    public String getSubstitution(@PathVariable String variation, @PathVariable int num) {
        if(variation.equals("plainFizzBuzz"))
            return fizzBuzzService.plainFizzBuzz(num);
        if(variation.equals("fizzBuzzPop"))
            return fizzBuzzService.fizzBuzzPop(num);
        return "Entered variation is invalid";
    }
}
