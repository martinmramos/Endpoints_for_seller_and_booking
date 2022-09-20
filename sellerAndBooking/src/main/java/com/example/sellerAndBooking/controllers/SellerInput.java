package com.example.sellerAndBooking.controllers;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class SellerInput {

    @NotBlank(message = "DNI is empty.")
    @NotNull(message = "DNI is null")
    private String dni;
    @NotBlank(message = "Name is empty.")
    @NotNull(message = "Name is null")
    private String name;
    @NotNull(message = "Age is null.")
    @Positive(message = "Age is negative.")
    private int age;

    public SellerInput(String dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    public SellerInput(){

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
