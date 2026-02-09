package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateCopyrightRequest;
import com.ozalp.portfolio.business.dtos.responses.CopyrightResponse;
import com.ozalp.portfolio.entities.Copyright;

public interface CopyrightService extends BaseService<CreateCopyrightRequest, Copyright> {

    CopyrightResponse getCopyright();

}
