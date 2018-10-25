package com.codeclan.example.BookingSystem.repositories.customerRepository;

import com.codeclan.example.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> GetCustomersByCourse(Long courseId);
    List<Customer> GetCustomersByTownAndCourse (String town, Long courseId);
}
