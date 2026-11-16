package com.example.hospital_manager.dto;

import java.time.LocalDateTime;

public record AppointmentResponse(
    Long id,
    String patientName,
    String doctorName,
    LocalDateTime appointmentTime,
    String status
) {}