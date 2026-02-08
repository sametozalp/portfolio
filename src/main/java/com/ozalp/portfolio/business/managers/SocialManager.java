package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateSocialRequest;
import com.ozalp.portfolio.business.dtos.responses.SocialResponse;
import com.ozalp.portfolio.business.mappers.SocialMapper;
import com.ozalp.portfolio.business.services.SocialService;
import com.ozalp.portfolio.dataAccess.SocialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SocialManager implements SocialService {

    private final SocialMapper mapper;
    private final SocialRepository repository;

    @Override
    public void add(CreateSocialRequest createSocialRequest) {
        repository.save(mapper.toEntity(createSocialRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(Boolean value) {

    }

    @Override
    public List<SocialResponse> getSocials() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
