package com.springboot.mapstruct.example.mapper;

import com.springboot.mapstruct.example.models.dtos.DDto;
import com.springboot.mapstruct.example.models.entities.DEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class DMapperDecorator implements DMapper {

    @Autowired
    @Qualifier("delegate")
    private DMapper delegate;

    @Override
    public DEntity dtoToEntity(DDto dto){
        DEntity entity = delegate.dtoToEntity(dto);
        DEntity.StringList nestedList = new DEntity.StringList();
        nestedList.getStringList().addAll(dto.getStringList());
        entity.setList(nestedList);
        return entity;
    }
}
