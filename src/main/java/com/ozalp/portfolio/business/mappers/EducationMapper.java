package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.CreateEducationRequest;
import com.ozalp.portfolio.business.dtos.responses.EducationResponse;
import com.ozalp.portfolio.entities.Education;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EducationMapper extends BaseMapper<Education, CreateEducationRequest, EducationResponse> {
}
