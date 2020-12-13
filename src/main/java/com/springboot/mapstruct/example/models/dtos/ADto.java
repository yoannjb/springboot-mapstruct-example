package com.springboot.mapstruct.example.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ADto {
    private long id;
    private String dtoName;
    private int aNumber;
}
