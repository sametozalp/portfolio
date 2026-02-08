package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateEducationRequest;
import com.ozalp.portfolio.business.dtos.responses.EducationResponse;
import com.ozalp.portfolio.business.mappers.EducationMapper;
import com.ozalp.portfolio.business.services.EducationService;
import com.ozalp.portfolio.dataAccess.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationManager implements EducationService {

    private final EducationRepository repository;
    private final EducationMapper mapper;

    @Override
    public void add(CreateEducationRequest createEducationRequest) {
        repository.save(mapper.toEntity(createEducationRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(Boolean value) {

    }

    @Override
    public List<EducationResponse> getEducations() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
