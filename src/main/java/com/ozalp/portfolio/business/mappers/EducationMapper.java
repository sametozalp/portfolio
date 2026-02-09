package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateEducationRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateEducationRequest;
import com.ozalp.portfolio.business.dtos.responses.EducationResponse;
import com.ozalp.portfolio.entities.Education;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EducationMapper extends BaseMapper<Education, CreateEducationRequest, EducationResponse> {

    void updateEntity(UpdateEducationRequest request, @MappingTarget Education entity);


}
