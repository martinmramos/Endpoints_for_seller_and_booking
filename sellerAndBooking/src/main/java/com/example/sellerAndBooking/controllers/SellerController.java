package com.example.sellerAndBooking.controllers;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class SellerController {

    @PostMapping("/sellers")
    public void addSeller(@Valid @RequestBody SellerInput seller){
        System.out.println("Vendedor dado de alta.");
    }

    @PutMapping("/sellers/{id}")
    public void updateSeller(@PathVariable String id, @Valid @RequestBody SellerUpdate seller){
        System.out.println("Vendedor modificado.");
    }

    @DeleteMapping("/sellers/{id}")
    public void deleteSeller(@PathVariable String id){
        System.out.println("Vendedor borrado.");
    }
}
