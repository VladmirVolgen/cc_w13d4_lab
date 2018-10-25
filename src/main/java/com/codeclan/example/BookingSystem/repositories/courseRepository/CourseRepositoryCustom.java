package com.codeclan.example.BookingSystem.repositories.courseRepository;

import com.codeclan.example.BookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getCoursesByRating(int rating);
}
