package com.springboot.mapstruct.example.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AEntity extends Entity {
    private String entityName;
    private int aNumber;

}
