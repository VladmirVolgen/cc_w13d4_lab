package com.codeclan.example.BookingSystem.controllers;

import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "course/{courseId}")
    public List<Customer> GetCustomersByCourse(@PathVariable Long courseId) {
        return customerRepository.GetCustomersByCourse(courseId);
    }

    @GetMapping(value = "course/{courseId}/town/{town}")
    public List<Customer> GetCustomersByTownAndCourse(@PathVariable String town, @PathVariable Long courseId) {
        return customerRepository.GetCustomersByTownAndCourse(town, courseId);
    }
}
