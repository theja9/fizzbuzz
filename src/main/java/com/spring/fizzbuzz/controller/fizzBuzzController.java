package com.spring.fizzbuzz.controller;

import com.spring.fizzbuzz.model.FizzBuzzRequest;
import com.spring.fizzbuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fizzbuzz")
public class fizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @GetMapping("/{variation}/{num}")
    public String getSubstitution(@PathVariable String variation, @PathVariable int num) {
        if (variation.equals("plainFizzBuzz"))
            return fizzBuzzService.plainFizzBuzz(num);
        if (variation.equals("fizzBuzzPop"))
            return fizzBuzzService.fizzBuzzPop(num);
        return "Entered variation is invalid";
    }

    @PostMapping("/{variation}/{num}")
    public String getCustomSubstitution(@RequestBody FizzBuzzRequest request, @PathVariable String variation, @PathVariable int num) {
        if (variation.equals("customFizzBuzz"))
            return fizzBuzzService.customFizzBuzz(request, num);
        return "Entered variation is not valid";
    }

}
