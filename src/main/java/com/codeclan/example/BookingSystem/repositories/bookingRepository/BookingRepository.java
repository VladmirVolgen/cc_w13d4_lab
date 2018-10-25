package com.codeclan.example.BookingSystem.repositories.bookingRepository;

import com.codeclan.example.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
