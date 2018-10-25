package com.codeclan.example.BookingSystem;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void customerCanBookCourse() {
		Customer customer = new Customer("Bob", "Edinburgh", 25);
		Course course = new Course("Java", "Edinburgh");
		Booking booking = new Booking("25/10/18", customer, course);
	}

}
