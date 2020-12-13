package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.CDto;
import com.springboot.mapstruct.example.models.entities.CEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CMapper {

    CEntity dtoToEntity(CDto dto) {
        String fullName = dto.getFirstName() + " " + dto.getLastName();
        return new CEntity(fullName);
    }
}
