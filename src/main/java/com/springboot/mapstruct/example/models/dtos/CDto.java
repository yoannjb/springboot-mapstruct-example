package com.springboot.mapstruct.example.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CDto {
    private String firstName;
    private String lastName;
}
