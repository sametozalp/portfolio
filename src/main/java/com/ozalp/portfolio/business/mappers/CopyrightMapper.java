package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateCopyrightRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateCopyrightRequest;
import com.ozalp.portfolio.business.dtos.responses.CopyrightResponse;
import com.ozalp.portfolio.entities.Copyright;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CopyrightMapper extends BaseMapper<Copyright, CreateCopyrightRequest, CopyrightResponse> {

    void updateEntity(UpdateCopyrightRequest request, @MappingTarget Copyright entity);


}
