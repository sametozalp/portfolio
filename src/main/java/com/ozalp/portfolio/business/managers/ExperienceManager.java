package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateExperienceRequest;
import com.ozalp.portfolio.business.dtos.responses.ExperienceResponse;
import com.ozalp.portfolio.business.mappers.ExperienceMapper;
import com.ozalp.portfolio.business.services.ExperienceService;
import com.ozalp.portfolio.dataAccess.ExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperienceManager implements ExperienceService {

    private final ExperienceRepository repository;
    private final ExperienceMapper mapper;

    @Override
    public void add(CreateExperienceRequest createExperienceRequest) {
        repository.save(mapper.toEntity(createExperienceRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(Boolean value) {

    }

    @Override
    public List<ExperienceResponse> getExperience() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
