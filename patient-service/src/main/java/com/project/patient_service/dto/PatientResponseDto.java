package com.project.patient_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientResponseDto {

    private String name;

    private String address;

    private String email;

    private String dateOfBirth;
}
