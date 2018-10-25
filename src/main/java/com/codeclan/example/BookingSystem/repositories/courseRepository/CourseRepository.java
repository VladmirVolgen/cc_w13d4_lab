package com.codeclan.example.BookingSystem.repositories.courseRepository;

import com.codeclan.example.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
