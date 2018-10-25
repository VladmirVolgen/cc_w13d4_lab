package com.codeclan.example.BookingSystem.repositories.bookingRepository;

import com.codeclan.example.BookingSystem.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> getBookingsByDate(String date);
}
