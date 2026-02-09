package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateProjectRequest;
import com.ozalp.portfolio.business.dtos.responses.ProjectResponse;
import com.ozalp.portfolio.entities.Project;

import java.util.List;

public interface ProjectService extends BaseService<CreateProjectRequest, Project> {

    List<ProjectResponse> getProjects();

}
