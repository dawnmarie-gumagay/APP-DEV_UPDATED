package com.csit321g4.gumagay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.csit321g4.gumagay.Entity.ExerciseEntity;

@Repository
public interface ExerciseRepository extends JpaRepository<ExerciseEntity, Integer> {
    
}


