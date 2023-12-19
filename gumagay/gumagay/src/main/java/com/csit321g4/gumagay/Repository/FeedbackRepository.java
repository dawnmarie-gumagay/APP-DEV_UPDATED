package com.csit321g4.gumagay.Repository;

import com.csit321g4.gumagay.Entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Long> {

    List<FeedbackEntity> findByEmail(String email);

    // Add other custom queries based on your requirements

    // Example: List<FeedbackEntity> findByParentName(String parentName);
    // Example: List<FeedbackEntity> findByFeedbackMessageContaining(String keyword);
}
