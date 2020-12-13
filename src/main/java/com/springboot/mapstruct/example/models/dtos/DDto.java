package com.springboot.mapstruct.example.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DDto {
    private String string;
    private List<String> stringList;
}
