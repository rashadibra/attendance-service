package com.example.demo.dto;

import lombok.AllArgsConstructor;

public record UserDto(
        String badgeNum,
        String ssn,
        String name,
        String gender,
        String title,
        String defaultDeptId,
        String cardNo
) { }