package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.BDto;
import com.springboot.mapstruct.example.models.entities.BEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = AMapper.class)
public interface BMapper {

    @Mapping(target = "defaultValue", source = "nullValue", defaultValue = "default")
    @Mapping(source = "dto.ADto", target = "AEntity")
    BEntity dtoToEntity(BDto dto);
}
