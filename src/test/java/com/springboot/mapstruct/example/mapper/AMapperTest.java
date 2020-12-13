package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.ADto;
import com.springboot.mapstruct.example.models.entities.AEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AMapperTest {

    @Autowired
    AMapper mapper;

    @Test
    void dtoToEntity() {
        ADto dto = new ADto();
        dto.setId(1L);
        dto.setDtoName("A");
        dto.setANumber(20);

        AEntity entity = mapper.dtoToEntity(dto);
        assertEquals(entity.getEntityName(), dto.getDtoName());
        assertEquals(entity.getANumber(), dto.getANumber());
        assertEquals(entity.getId(), dto.getId());
    }

    @Test
    void entityToDto() {
        AEntity entity = new AEntity();
        entity.setId(2L);
        entity.setEntityName("A");
        entity.setANumber(30);

        ADto dto =  mapper.entityToDto(entity);
        assertEquals(dto.getDtoName(),entity.getEntityName());
        assertEquals(dto.getId(),entity.getId());
        assertEquals(dto.getANumber(),entity.getANumber());
    }
}