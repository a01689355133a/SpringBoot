package com.example.demo.crud.controller;

import com.example.demo.crud.entity.entityStudent;
import com.example.demo.crud.request.createStudentRequest;
import com.example.demo.crud.request.requestCodeStudent;
import com.example.demo.crud.request.updateStudentRequest;
import com.example.demo.crud.service.serviceStudent;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/student")
public class controllerStudent {
    @Autowired
    serviceStudent serviceStudent;
    @PostMapping
    requestCodeStudent<entityStudent> createStudent(@RequestBody @Valid createStudentRequest request){
        requestCodeStudent codeStudent = new requestCodeStudent();
        codeStudent.setResult(serviceStudent.createStudent(request));
        return codeStudent ;
    }
    @GetMapping
    List<entityStudent> getAllStudent(){
       return serviceStudent.getAllStudent();
    }
    @PutMapping("/{id}")
    entityStudent updateStudent(@PathVariable int id,@RequestBody updateStudentRequest request){
       return serviceStudent.updateStudent(id, request);
    }
    @GetMapping("/{id}")
    requestCodeStudent<entityStudent> getByIdStudent(@PathVariable int id){
        requestCodeStudent requestEntityStudent = new requestCodeStudent<>();
        requestEntityStudent.setResult( serviceStudent.getStudent(id));
       return requestEntityStudent;
    }
}
