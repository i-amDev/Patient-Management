package com.project.patient_service.service;

import com.project.patient_service.dto.PatientRequestDto;
import com.project.patient_service.dto.PatientResponseDto;
import com.project.patient_service.entity.Patient;
import com.project.patient_service.mapper.PatientMapper;
import com.project.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public List<PatientResponseDto> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream().map(patient -> PatientMapper.mapToResponseDto(patient)).toList();
    }

    public PatientResponseDto createPatient(PatientRequestDto patientRequestDto) {
        Patient patient = PatientMapper.mapToEntity(patientRequestDto);
        Patient savedEntity = patientRepository.save(patient);
        return PatientMapper.mapToResponseDto(savedEntity);
    }
}
