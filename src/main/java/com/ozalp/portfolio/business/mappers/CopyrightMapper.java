package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.CreateCopyrightRequest;
import com.ozalp.portfolio.business.dtos.responses.CopyrightResponse;
import com.ozalp.portfolio.entities.Copyright;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CopyrightMapper extends BaseMapper<Copyright, CreateCopyrightRequest, CopyrightResponse> {
}
