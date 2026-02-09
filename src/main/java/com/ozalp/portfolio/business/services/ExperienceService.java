package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateExperienceRequest;
import com.ozalp.portfolio.business.dtos.responses.ExperienceResponse;
import com.ozalp.portfolio.entities.Experience;

import java.util.List;

public interface ExperienceService extends BaseService<CreateExperienceRequest, Experience> {

    List<ExperienceResponse> getExperience();

}
