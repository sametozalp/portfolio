package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.CreateSocialRequest;
import com.ozalp.portfolio.business.dtos.responses.SocialResponse;
import com.ozalp.portfolio.entities.Social;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SocialMapper extends BaseMapper<Social, CreateSocialRequest, SocialResponse> {
}
