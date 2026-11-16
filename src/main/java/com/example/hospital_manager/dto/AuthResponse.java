package com.example.hospital_manager.dto;

public record AuthResponse(
    String token,
    String tokenType,
    long expiresInMs,
    String username,
    String fullName,
    String role
) {}
