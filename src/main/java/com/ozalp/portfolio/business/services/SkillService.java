package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateSkillRequest;
import com.ozalp.portfolio.business.dtos.responses.SkillResponse;

import java.util.List;

public interface SkillService extends BaseService<CreateSkillRequest> {

    List<SkillResponse> getSkills();

}
