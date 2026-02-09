package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateSocialRequest;
import com.ozalp.portfolio.business.dtos.responses.SocialResponse;
import com.ozalp.portfolio.entities.Social;

import java.util.List;

public interface SocialService extends BaseService<CreateSocialRequest, Social> {

    List<SocialResponse> getSocials();

}
