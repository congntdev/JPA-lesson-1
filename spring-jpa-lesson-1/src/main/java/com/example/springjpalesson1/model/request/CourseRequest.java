package com.example.springjpalesson1.model.request;


import lombok.Data;

import java.time.LocalDate;

@Data
public class CourseRequest {

    private String name;

    private String lecture;

    private LocalDate startTime;

    private LocalDate endTime;

}
