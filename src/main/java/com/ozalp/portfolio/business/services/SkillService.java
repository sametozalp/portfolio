package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateSkillRequest;
import com.ozalp.portfolio.business.dtos.responses.SkillResponse;
import com.ozalp.portfolio.entities.Skill;

import java.util.List;

public interface SkillService extends BaseService<CreateSkillRequest, Skill> {

    List<SkillResponse> getSkills();

}
