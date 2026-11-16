package com.example.hospital_manager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MedicalRecordRequest(
    @NotNull(message = "Patient ID is required") Long patientId,
    @NotBlank(message = "Diagnosis cannot be blank") String diagnosis,
    @NotBlank(message = "Prescription cannot be blank") String prescription
) {}