package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateSocialRequest;
import com.ozalp.portfolio.business.dtos.responses.SocialResponse;

import java.util.List;

public interface SocialService extends BaseService<CreateSocialRequest> {

    List<SocialResponse> getSocials();

}
