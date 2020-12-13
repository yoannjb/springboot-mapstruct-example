package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.ADto;
import com.springboot.mapstruct.example.models.dtos.BDto;
import com.springboot.mapstruct.example.models.entities.BEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BMapperTest {

    @Autowired
    BMapper mapper;

    @Test
    void dtoToEntity() {
        BDto dto=new BDto();
        dto.setName("B");
        dto.setTimeOfTheDay(LocalDate.now());
        ADto aDto = new ADto();
        aDto.setId(1L);
        aDto.setDtoName("A");
        aDto.setANumber(20);
        dto.setADto(aDto);

        BEntity entity = mapper.dtoToEntity(dto);

        assertEquals(entity.getName(),dto.getName());
        assertEquals(entity.getTimeOfTheDay(),dto.getTimeOfTheDay());
        assertEquals(entity.getAEntity().getEntityName(), dto.getADto().getDtoName());
        assertEquals(entity.getAEntity().getANumber(), dto.getADto().getANumber());
        assertEquals(entity.getAEntity().getId(), dto.getADto().getId());
        assertNotNull(entity.getDefaultValue());
        assertEquals(entity.getDefaultValue(),"default");
    }
}