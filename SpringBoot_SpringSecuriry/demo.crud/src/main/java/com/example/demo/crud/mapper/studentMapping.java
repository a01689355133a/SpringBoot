package com.example.demo.crud.mapper;


import com.example.demo.crud.entity.entityStudent;
import com.example.demo.crud.request.createStudentRequest;
import com.example.demo.crud.request.updateStudentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface studentMapping {
    entityStudent toCreateStudent(createStudentRequest request);
    entityStudent toUpdateStudent ( @MappingTarget entityStudent student, updateStudentRequest request);
}
