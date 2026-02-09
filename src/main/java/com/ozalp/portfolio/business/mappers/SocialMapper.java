package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateSocialRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateSocialRequest;
import com.ozalp.portfolio.business.dtos.responses.SocialResponse;
import com.ozalp.portfolio.entities.Social;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface SocialMapper extends BaseMapper<Social, CreateSocialRequest, SocialResponse> {

    void updateEntity(UpdateSocialRequest request, @MappingTarget Social entity);


}
