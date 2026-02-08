package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateAboutRequest;
import com.ozalp.portfolio.business.dtos.responses.AboutResponse;
import com.ozalp.portfolio.business.exeptions.errors.DataAlreadyExist;
import com.ozalp.portfolio.business.mappers.AboutMapper;
import com.ozalp.portfolio.business.services.AboutService;
import com.ozalp.portfolio.dataAccess.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutManager implements AboutService {

    private final AboutRepository repository;
    private final AboutMapper mapper;

    @Override
    public void add(CreateAboutRequest createAboutRequest) {
        if (!repository.findAllByDeletedAtIsNullAndShowableIsTrue().isEmpty()) {
            throw new DataAlreadyExist();
        }

        repository.save(mapper.toEntity(createAboutRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(Boolean value) {

    }

    @Override
    public AboutResponse getAbout() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue(PageRequest.of(0, 1))
                .stream()
                .map(mapper::toResponse)
                .toList()
                .getFirst();
    }
}
