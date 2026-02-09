package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateSkillRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateSkillRequest;
import com.ozalp.portfolio.business.dtos.responses.SkillResponse;
import com.ozalp.portfolio.entities.Skill;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface SkillMapper extends BaseMapper<Skill, CreateSkillRequest, SkillResponse> {

    void updateEntity(UpdateSkillRequest request, @MappingTarget Skill entity);


}
