package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateSkillRequest;
import com.ozalp.portfolio.business.dtos.responses.SkillResponse;
import com.ozalp.portfolio.business.mappers.SkillMapper;
import com.ozalp.portfolio.business.services.SkillService;
import com.ozalp.portfolio.dataAccess.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillManager implements SkillService {

    private final SkillMapper mapper;
    private final SkillRepository repository;

    @Override
    public void add(CreateSkillRequest createSkillRequest) {
        repository.save(mapper.toEntity(createSkillRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(Boolean value) {

    }

    @Override
    public List<SkillResponse> getSkills() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
