package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.ADto;
import com.springboot.mapstruct.example.models.entities.AEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AMapper {

    @Mapping(source = "dtoName",target = "entityName")
    AEntity dtoToEntity(ADto dto);

    @InheritInverseConfiguration
    ADto entityToDto(AEntity entity);
}
