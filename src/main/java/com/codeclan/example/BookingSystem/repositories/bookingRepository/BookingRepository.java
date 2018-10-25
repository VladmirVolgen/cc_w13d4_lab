package com.codeclan.example.BookingSystem.repositories.bookingRepository;

import com.codeclan.example.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> getBookingsByDate(String date);
}
