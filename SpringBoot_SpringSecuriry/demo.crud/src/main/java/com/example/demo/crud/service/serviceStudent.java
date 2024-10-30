package com.example.demo.crud.service;

import com.example.demo.crud.entity.entityStudent;
import com.example.demo.crud.exception.errorCode;
import com.example.demo.crud.exception.handleException;
import com.example.demo.crud.mapper.studentMapping;
import com.example.demo.crud.repository.repositoryStudent;
import com.example.demo.crud.request.createStudentRequest;
import com.example.demo.crud.request.updateStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceStudent {
    @Autowired
    repositoryStudent repositoryStudent;
    @Autowired
    studentMapping studentMapping;

    public entityStudent createStudent(createStudentRequest request){
        return repositoryStudent.save(studentMapping.toCreateStudent(request));
    }
    public List<entityStudent> getAllStudent(){
        return repositoryStudent.findAll();
    }
    public entityStudent updateStudent(int Id,updateStudentRequest request){
            entityStudent student = getStudent(Id);
            return repositoryStudent.save(studentMapping.toUpdateStudent(student, request));
    }
    public entityStudent getStudent(int Id){
        return repositoryStudent.findById(Id).orElseThrow(() -> new handleException(errorCode.USER_NOT_FOUND));
    }
}
