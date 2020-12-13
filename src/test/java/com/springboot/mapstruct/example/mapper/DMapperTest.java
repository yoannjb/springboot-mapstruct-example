package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.DDto;
import com.springboot.mapstruct.example.models.entities.DEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DMapperTest {

    @Autowired
    private DMapper mapper;

    @Test
    void dtoToEntity() {
        DDto dto = new DDto();
        dto.setString("test");
        dto.setStringList(Arrays.asList("A", "B", "C"));

        DEntity entity = mapper.dtoToEntity(dto);

        assertEquals(entity.getString(),dto.getString());
        assertEquals(entity.getList().getStringList(),dto.getStringList());
    }
}