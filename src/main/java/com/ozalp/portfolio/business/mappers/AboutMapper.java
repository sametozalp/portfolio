package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.CreateAboutRequest;
import com.ozalp.portfolio.business.dtos.responses.AboutResponse;
import com.ozalp.portfolio.entities.About;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AboutMapper extends BaseMapper<About, CreateAboutRequest, AboutResponse> {
}
