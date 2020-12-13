package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.CDto;
import com.springboot.mapstruct.example.models.entities.CEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CMapperTest {

    @Autowired
    CMapper mapper;

    @Test
    void dtoToEntity() {
        CDto dto = new CDto();
        dto.setFirstName("John");
        dto.setLastName("Smith");

        CEntity entity = mapper.dtoToEntity(dto);

        assertEquals(entity.getFullName(), dto.getFirstName() + " " + dto.getLastName());
    }
}