package com.example.demo.dto;

import lombok.AllArgsConstructor;

public record UserDto(
        String badgerNum,
        String ssn,
        String name,
        String gender,
        String title,
        String defaultDeptId,
        String cardNo
) { }