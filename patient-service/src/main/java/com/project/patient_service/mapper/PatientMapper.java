package com.project.patient_service.mapper;

import com.project.patient_service.dto.PatientRequestDto;
import com.project.patient_service.dto.PatientResponseDto;
import com.project.patient_service.entity.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDto mapToResponseDto(Patient patient) {
        PatientResponseDto responseDto = new PatientResponseDto();

        responseDto.setName(patient.getName());
        responseDto.setAddress(patient.getAddress());
        responseDto.setEmail(patient.getEmail());
        responseDto.setDateOfBirth(patient.getDateOfBirth().toString());

        return responseDto;
    }

    public static Patient mapToEntity(PatientRequestDto patientRequestDto) {
        Patient patient = new Patient();

        patient.setName(patientRequestDto.getName());
        patient.setAddress(patientRequestDto.getAddress());
        patient.setEmail(patientRequestDto.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDto.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDto.getRegisteredDate()));

        return patient;
    }
}
