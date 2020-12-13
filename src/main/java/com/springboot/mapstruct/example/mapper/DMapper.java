package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.DDto;
import com.springboot.mapstruct.example.models.entities.DEntity;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(DMapperDecorator.class)
public interface DMapper {

    DEntity dtoToEntity(DDto dto);
}
