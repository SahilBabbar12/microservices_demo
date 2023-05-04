package com.knoldus.projectservice.customexception;

public class EmptyInputException extends RuntimeException{

    public EmptyInputException() {
        super("Empty input!");
    }

    public EmptyInputException(String message) {
        super(message);
    }
}
