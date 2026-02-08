package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateEducationRequest;
import com.ozalp.portfolio.business.dtos.responses.EducationResponse;

import java.util.List;

public interface EducationService extends BaseService<CreateEducationRequest> {

    List<EducationResponse> getEducations();

}
