package com.knoldus.projectservice.customexception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiError {
    private String message;
    private HttpStatus status;
    private LocalDateTime timeStamp;

    public ApiError(String message, HttpStatus status, LocalDateTime timeStamp) {
        this.message = message;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return status;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.status = httpStatus;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}

