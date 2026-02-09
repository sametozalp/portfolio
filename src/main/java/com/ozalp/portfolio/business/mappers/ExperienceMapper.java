package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateExperienceRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateExperienceRequest;
import com.ozalp.portfolio.business.dtos.responses.ExperienceResponse;
import com.ozalp.portfolio.entities.Experience;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ExperienceMapper extends BaseMapper<Experience, CreateExperienceRequest, ExperienceResponse> {

    void updateEntity(UpdateExperienceRequest request, @MappingTarget Experience entity);


}
