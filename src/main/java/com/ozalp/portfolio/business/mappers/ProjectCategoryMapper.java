package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.CreateProjectCategoryRequest;
import com.ozalp.portfolio.business.dtos.responses.ProjectCategoryResponse;
import com.ozalp.portfolio.entities.ProjectCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectCategoryMapper extends BaseMapper<ProjectCategory, CreateProjectCategoryRequest, ProjectCategoryResponse> {
}
