package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateProjectRequest;
import com.ozalp.portfolio.business.dtos.responses.ProjectResponse;

import java.util.List;

public interface ProjectService extends BaseService<CreateProjectRequest> {

    List<ProjectResponse> getProjects();

}
