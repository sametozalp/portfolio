package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateProjectCategoryRequest;
import com.ozalp.portfolio.business.mappers.ProjectCategoryMapper;
import com.ozalp.portfolio.business.services.ProjectCategoryService;
import com.ozalp.portfolio.dataAccess.ProjectCategoryRepository;
import com.ozalp.portfolio.entities.ProjectCategory;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectCategoryManager implements ProjectCategoryService {

    private final ProjectCategoryMapper mapper;
    private final ProjectCategoryRepository repository;

    @Override
    public void add(CreateProjectCategoryRequest createProjectCategoryRequest) {
        repository.save(mapper.toEntity(createProjectCategoryRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(int id, Boolean value) {
        ProjectCategory projectCategory = findById(id);
        projectCategory.setShowable(value);
        repository.save(projectCategory);
    }

    @Override
    public ProjectCategory findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Not found"));
    }
}
