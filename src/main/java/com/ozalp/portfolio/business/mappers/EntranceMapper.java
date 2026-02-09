package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateEntranceRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateEntranceRequest;
import com.ozalp.portfolio.business.dtos.responses.EntranceResponse;
import com.ozalp.portfolio.entities.Entrance;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EntranceMapper extends BaseMapper<Entrance, CreateEntranceRequest, EntranceResponse> {

    void updateEntity(UpdateEntranceRequest request, @MappingTarget Entrance entity);

}
