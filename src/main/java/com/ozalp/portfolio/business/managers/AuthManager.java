package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateAuthRequest;
import com.ozalp.portfolio.business.mappers.AuthMapper;
import com.ozalp.portfolio.business.services.AuthService;
import com.ozalp.portfolio.dataAccess.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthManager implements AuthService {
    private final AuthRepository repository;
    private final AuthMapper mapper;

    @Override
    public void add(CreateAuthRequest createAuthRequest) {
        repository.save(mapper.toEntity(createAuthRequest));
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void setShowable(Boolean value) {

    }
}
