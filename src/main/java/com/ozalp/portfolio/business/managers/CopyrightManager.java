package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateCopyrightRequest;
import com.ozalp.portfolio.business.dtos.responses.CopyrightResponse;
import com.ozalp.portfolio.business.exeptions.errors.DataAlreadyExist;
import com.ozalp.portfolio.business.mappers.CopyrightMapper;
import com.ozalp.portfolio.business.services.CopyrightService;
import com.ozalp.portfolio.dataAccess.CopyrightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CopyrightManager implements CopyrightService {

    private final CopyrightRepository repository;
    private final CopyrightMapper mapper;

    @Override
    public void add(CreateCopyrightRequest createCopyrightRequest) {
        if (!repository.findAllByDeletedAtIsNullAndShowableIsTrue().isEmpty()) {
            throw new DataAlreadyExist();
        }
        repository.save(mapper.toEntity(createCopyrightRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(Boolean value) {

    }

    @Override
    public CopyrightResponse getCopyright() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue(PageRequest.of(0, 1))
                .stream()
                .map(mapper::toResponse)
                .toList()
                .getFirst();
    }
}
