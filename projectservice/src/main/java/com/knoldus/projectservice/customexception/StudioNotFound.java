package com.knoldus.projectservice.customexception;

public class StudioNotFound extends RuntimeException{

    public StudioNotFound() {
        super("Studio not present for the given id!");
    }

    public StudioNotFound(String message) {
        super(message);
    }
}
