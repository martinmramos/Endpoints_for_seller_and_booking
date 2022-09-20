package com.example.sellerAndBooking.controllers;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class SellerUpdate {

    @NotBlank(message = "DNI is empty.")
    @NotNull(message = "DNI is null")
    private String name;
    @NotNull(message = "Age is null.")
    @Positive(message = "Age is negative.")
    private int age;

    public SellerUpdate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SellerUpdate(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
