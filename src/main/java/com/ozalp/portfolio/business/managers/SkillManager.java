package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateSkillRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateSkillRequest;
import com.ozalp.portfolio.business.dtos.responses.SkillResponse;
import com.ozalp.portfolio.business.mappers.SkillMapper;
import com.ozalp.portfolio.business.services.SkillService;
import com.ozalp.portfolio.dataAccess.SkillRepository;
import com.ozalp.portfolio.entities.Skill;
import jakarta.persistence.EntityNotFoundException;
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
        var entity = findById(id);
        entity.markAsDeleted();
        repository.save(entity);

    }

    @Override
    public void setShowable(int id, Boolean value) {
        Skill skill = findById(id);
        skill.setShowable(value);
        repository.save(skill);
    }

    @Override
    public Skill findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Not found"));
    }

    @Override
    public List<SkillResponse> getSkills() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public void update(int id, UpdateSkillRequest request) {
        var entity = findById(id);
        mapper.updateEntity(request, entity);
        repository.save(entity);
    }
}
