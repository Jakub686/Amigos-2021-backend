package com.amigo2021.AngularSpringBootAmigo2021.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}