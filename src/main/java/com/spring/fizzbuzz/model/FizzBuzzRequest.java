package com.spring.fizzbuzz.model;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

public class FizzBuzzRequest {

    @Range(min = 1)
    private int num1;
    @Range(min = 1)
    private int num2;
    @NotNull
    private String keyword1;
    @NotNull
    private String keyword2;

    public FizzBuzzRequest(int num1, int num2, String keyword1, String keyword2) {
        this.num1 = num1;
        this.num2 = num2;
        this.keyword1 = keyword1;
        this.keyword2 = keyword2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getKeyword1() {
        return keyword1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    @Override
    public String toString() {
        return "FizzBuzzRequest{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", keyword1=" + keyword1 +
                ", keyword2=" + keyword2 +
                '}';
    }
}
