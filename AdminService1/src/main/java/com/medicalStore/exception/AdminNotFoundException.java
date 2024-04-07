package com.medicalStore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Indicates that this exception should result in an HTTP 404 Not Found status
@ResponseStatus(HttpStatus.NOT_FOUND)
public class AdminNotFoundException extends RuntimeException {

    // Constructor to create an instance of AdminNotFoundException with a custom message
    public AdminNotFoundException(String message) {
        super(message);
    }
}
