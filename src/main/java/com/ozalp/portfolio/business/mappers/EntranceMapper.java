package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.CreateEntranceRequest;
import com.ozalp.portfolio.business.dtos.responses.EntranceResponse;
import com.ozalp.portfolio.entities.Entrance;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntranceMapper extends BaseMapper<Entrance, CreateEntranceRequest, EntranceResponse> {
}
