package com.springboot.mapstruct.example.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BEntity {
    private String name;
    private LocalDate timeOfTheDay;
    private AEntity aEntity;
    private String defaultValue;
}
