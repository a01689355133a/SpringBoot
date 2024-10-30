package com.example.demo.crud.mapper;

import com.example.demo.crud.entity.entityStudent;
import com.example.demo.crud.request.createStudentRequest;
import com.example.demo.crud.request.updateStudentRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-26T23:15:13+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class studentMappingImpl implements studentMapping {

    @Override
    public entityStudent toCreateStudent(createStudentRequest request) {
        if ( request == null ) {
            return null;
        }

        entityStudent entityStudent = new entityStudent();

        entityStudent.setFirstName( request.getFirstName() );
        entityStudent.setLastName( request.getLastName() );
        entityStudent.setClassName( request.getClassName() );
        entityStudent.setPassword( request.getPassword() );
        entityStudent.setBorn( request.getBorn() );

        return entityStudent;
    }

    @Override
    public entityStudent toUpdateStudent(entityStudent student, updateStudentRequest request) {
        if ( request == null ) {
            return student;
        }

        student.setClassName( request.getClassName() );
        student.setBorn( request.getBorn() );

        return student;
    }
}
