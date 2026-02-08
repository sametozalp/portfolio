package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateProjectRequest;
import com.ozalp.portfolio.business.dtos.responses.ProjectResponse;
import com.ozalp.portfolio.business.mappers.ProjectMapper;
import com.ozalp.portfolio.business.services.ProjectService;
import com.ozalp.portfolio.dataAccess.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectManager implements ProjectService {

    private final ProjectRepository repository;
    private final ProjectMapper mapper;

    @Override
    public void add(CreateProjectRequest createProjectRequest) {
        repository.save(mapper.toEntity(createProjectRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(Boolean value) {

    }

    @Override
    public List<ProjectResponse> getProjects() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue(PageRequest.of(0, 1))
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
