package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.create.CreateSkillRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateSkillRequest;
import com.ozalp.portfolio.business.dtos.responses.SkillResponse;
import com.ozalp.portfolio.entities.Skill;

import java.util.List;

public interface SkillService extends BaseService<CreateSkillRequest, Skill> {

    List<SkillResponse> getSkills();

    void update(int id, UpdateSkillRequest request);


}
