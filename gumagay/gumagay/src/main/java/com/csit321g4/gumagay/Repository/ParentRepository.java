package com.csit321g4.gumagay.Repository;

import com.csit321g4.gumagay.Entity.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<ParentEntity, Long> {
    // You can add custom query methods if needed


}
