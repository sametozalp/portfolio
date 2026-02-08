package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateAboutRequest;
import com.ozalp.portfolio.business.dtos.responses.AboutResponse;

public interface AboutService extends BaseService<CreateAboutRequest> {

    AboutResponse getAbout();

}
