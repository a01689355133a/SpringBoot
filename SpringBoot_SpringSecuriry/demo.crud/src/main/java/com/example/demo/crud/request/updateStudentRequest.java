package com.example.demo.crud.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class updateStudentRequest {
    String ClassName;
    Date born;
}
