package com.jibran.product.information.management.exception;

public class ProductNotFoundException extends RuntimeException {

    private String message;

    public ProductNotFoundException(String message) {
        super(message);
        this.message = message;
    }


}
