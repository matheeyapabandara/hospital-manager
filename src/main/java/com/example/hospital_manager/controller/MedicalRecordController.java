package com.example.hospital_manager.controller;

import com.example.hospital_manager.dto.MedicalRecordRequest;
import com.example.hospital_manager.dto.MedicalRecordResponse;
import com.example.hospital_manager.service.MedicalRecordService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MedicalRecordController {

    private final MedicalRecordService medicalRecordService;

    @PostMapping("/api/doctors/records")
    public ResponseEntity<MedicalRecordResponse> createRecord(
            Authentication authentication,
            @Valid @RequestBody MedicalRecordRequest request) {
        return ResponseEntity.ok(medicalRecordService.createRecord(authentication.getName(), request));
    }

    
    @GetMapping("/api/patients/records")
    public ResponseEntity<List<MedicalRecordResponse>> getPatientRecords(Authentication authentication) {
        return ResponseEntity.ok(medicalRecordService.getPatientRecords(authentication.getName()));
    }
}
