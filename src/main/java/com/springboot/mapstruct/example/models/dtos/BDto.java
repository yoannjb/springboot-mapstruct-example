package com.springboot.mapstruct.example.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BDto {
    private String name;
    private LocalDate timeOfTheDay;
    private ADto aDto;
    private String nullValue;
}
