package com.foodapp.foodcartservice.exceptions;

public class ItemException extends RuntimeException{
    public ItemException() {
    }

    public ItemException(String message) {
        super(message);
    }
}
