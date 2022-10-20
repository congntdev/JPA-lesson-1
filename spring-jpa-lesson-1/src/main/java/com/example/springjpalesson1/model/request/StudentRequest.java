package com.example.springjpalesson1.model.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentRequest {

    private String fullName;

    private String phoneNumber;

    private LocalDate birthDay;
}
