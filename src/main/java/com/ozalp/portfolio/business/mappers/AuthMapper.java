package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateAuthRequest;
import com.ozalp.portfolio.business.dtos.responses.AuthResponse;
import com.ozalp.portfolio.entities.Auth;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthMapper extends BaseMapper<Auth, CreateAuthRequest, AuthResponse> {
}
