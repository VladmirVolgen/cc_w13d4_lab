package com.codeclan.example.BookingSystem.repositories.customerRepository;

import com.codeclan.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> GetCustomersByCourse(Long courseId);
    List<Customer> GetCustomersByTownAndCourse (String town, Long courseId);
    List<Customer> GetCustomersByAgeAndTownAndCourse(int age, String town, Long courseId);
}
