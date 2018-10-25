package com.codeclan.example.BookingSystem.components;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.BookingSystem.repositories.courseRepository.CourseRepository;
import com.codeclan.example.BookingSystem.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Customer customer = new Customer("Bob", "Edinburgh", 25);
        customerRepository.save(customer);
        Course course = new Course("Java", "Edinburgh");
        courseRepository.save(course);
        Booking booking = new Booking("25/10/18", customer, course);
        bookingRepository.save(booking);

        customer = new Customer("Sally", "Edinburgh", 30);
        customerRepository.save(customer);
        course = new Course("Python", "Edinburgh");
        courseRepository.save(course);
        booking = new Booking("26/10/18", customer, course);
        bookingRepository.save(booking);
        customer = new Customer("Frank", "Glasgow", 30);
        customerRepository.save(customer);
        booking = new Booking("26/10/18", customer, course);
        bookingRepository.save(booking);
    }
}
