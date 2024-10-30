package com.example.demo.crud.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum errorCode {
    USER_NOT_FOUND(1000, "user not found");
    ;

    int code;
    String message;
}
