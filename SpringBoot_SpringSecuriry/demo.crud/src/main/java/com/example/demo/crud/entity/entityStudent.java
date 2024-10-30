package com.example.demo.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.security.PrivateKey;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class entityStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String firstName;
    @Size(max = 5, message = "last name maximum 5 character")
    String lastName;
    String ClassName;
    @Size(min = 5, message = "password least 5 character")
    String password;
    Date born;
}
