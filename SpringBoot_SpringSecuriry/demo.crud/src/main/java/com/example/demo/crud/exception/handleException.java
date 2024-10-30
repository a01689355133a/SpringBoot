package com.example.demo.crud.exception;

public class handleException extends RuntimeException{
    errorCode errorCode;

    public handleException(errorCode errorCode) {
//        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
