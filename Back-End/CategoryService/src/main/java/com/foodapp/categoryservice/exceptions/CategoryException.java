package com.foodapp.categoryservice.exceptions;

public class CategoryException extends RuntimeException{
    public CategoryException() {
    }

    public CategoryException(String message) {
        super(message);
    }
}
