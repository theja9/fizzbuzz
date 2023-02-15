package com.spring.fizzbuzz.controller;

import com.spring.fizzbuzz.exception.InvalidDataException;
import com.spring.fizzbuzz.model.FizzBuzzRequest;
import com.spring.fizzbuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/fizzbuzz")
public class fizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @GetMapping("/{variation}/{num}")
    public String getSubstitution(@PathVariable String variation, @PathVariable int num) throws InvalidDataException {
        if (variation.equals("plainFizzBuzz"))
            return fizzBuzzService.plainFizzBuzz(num);
        if (variation.equals("fizzBuzzPop"))
            return fizzBuzzService.fizzBuzzPop(num);
        throw new InvalidDataException("Entered variation is not valid");
    }

    @PostMapping("/{variation}/{num}")
    public String getCustomSubstitution(@Valid @RequestBody FizzBuzzRequest request, @PathVariable String variation, @PathVariable int num) throws InvalidDataException {
        if (variation.equals("customFizzBuzz"))
            return fizzBuzzService.customFizzBuzz(request, num);
        throw new InvalidDataException("Entered variation is not valid");
    }

}
