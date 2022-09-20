package com.example.sellerAndBooking.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @PostMapping("/bookings/clients/{num}/cars/{id}")
    public void bookCar(@PathVariable String num, @PathVariable String id){
        System.out.println("El coche con ID " + id + " ha sido reservado por el cliente número " + num);
    }

    @DeleteMapping("/bookings/clients/{num}/cars/{id}")
    public void deleteBookCar(@PathVariable String num, @PathVariable String id){
        System.out.println("El cliente número " + num + " ha cancelado la reserva del coche con ID " + id);
    }
}
