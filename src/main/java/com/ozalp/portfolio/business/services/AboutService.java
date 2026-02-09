package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateAboutRequest;
import com.ozalp.portfolio.business.dtos.responses.AboutResponse;
import com.ozalp.portfolio.entities.About;

public interface AboutService extends BaseService<CreateAboutRequest, About> {

    AboutResponse getAbout();

}
