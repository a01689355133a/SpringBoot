package com.example.demo.crud.exception;

import com.example.demo.crud.request.requestCodeStudent;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class globalHandleException {
//catch
    @ExceptionHandler(handleException.class)
    public ResponseEntity<requestCodeStudent> handleRuntimeException(handleException e){
        requestCodeStudent codeStudent = new requestCodeStudent<>();
        errorCode errorCode = e.errorCode;
        codeStudent.setCode(errorCode.getCode());
        codeStudent.setMessage(errorCode.getMessage());
        return ResponseEntity.badRequest().body(codeStudent) ;
    }
    @ExceptionHandler(Exception.class)
    public  ResponseEntity<String> handleValidException(ConstraintViolationException e)
    {
        return ResponseEntity.badRequest().body(e.getConstraintViolations().
                                            stream().
                                            map(violation -> violation.getMessageTemplate()).
                                            findFirst().orElse("Validation error occurred"));
    }
}
