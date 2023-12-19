package com.csit321g4.gumagay.Controller;

import com.csit321g4.gumagay.Entity.FeedbackEntity;
import com.csit321g4.gumagay.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
@CrossOrigin(origins = ("http://localhost:3000"))
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @GetMapping("/print")
	public String itWorks() {
		return "It works";
	}

    //create
    @PostMapping("/submit")
    public ResponseEntity<FeedbackEntity> submitFeedback(@RequestBody FeedbackEntity feedback) {
        try {
            FeedbackEntity savedFeedback = feedbackService.saveFeedback(feedback);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedFeedback);
        } catch (Exception e) {
            // Log the exception
            // Consider using a logging framework like SLF4J
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    
    //read
    @GetMapping("/getAll")
    public ResponseEntity<List<FeedbackEntity>> getAllFeedback() {
        try {
            List<FeedbackEntity> feedbackList = feedbackService.getAllFeedback();
            return feedbackList.isEmpty()
                    ? ResponseEntity.status(HttpStatus.NO_CONTENT).body(null)
                    : ResponseEntity.status(HttpStatus.OK).body(feedbackList);
        } catch (Exception e) {
            // Log the exception
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    //update
    @PutMapping("/updateFeedback/{feedbackId}")
    public ResponseEntity<FeedbackEntity> updateFeedback(
            @PathVariable Long feedbackId,
            @RequestBody FeedbackEntity newFeedbackDetails
    ) {
        try {
            FeedbackEntity updatedFeedback = feedbackService.updateFeedback(feedbackId, newFeedbackDetails);
            return new ResponseEntity<>(updatedFeedback, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //delete
    @DeleteMapping("/deleteFeedback/{feedbackId}")
    public ResponseEntity<String> deleteFeedback(@PathVariable Long feedbackId) {
        try {
            String message = feedbackService.deleteFeedback(feedbackId);
            return new ResponseEntity<>(message, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
