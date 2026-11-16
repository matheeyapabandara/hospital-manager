package com.example.hospital_manager.controller;

import com.example.hospital_manager.dto.UserResponse;
import com.example.hospital_manager.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    
    @GetMapping("/api/doctors/patients")
    public ResponseEntity<List<UserResponse>> getAllPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    
    @GetMapping("/api/doctors/patients/{id}")
    public ResponseEntity<UserResponse> getPatientById(@PathVariable Long id) {
        return ResponseEntity.ok(patientService.getPatientById(id));
    }
}
