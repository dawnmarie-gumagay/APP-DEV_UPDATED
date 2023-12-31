package com.csit321g4.gumagay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.csit321g4.gumagay.Entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
    // Additional custom queries can be added here if needed
}