package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.CreateProjectRequest;
import com.ozalp.portfolio.business.dtos.responses.ProjectResponse;
import com.ozalp.portfolio.entities.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper extends BaseMapper<Project, CreateProjectRequest, ProjectResponse> {
}
