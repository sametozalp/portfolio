package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateCopyrightRequest;
import com.ozalp.portfolio.business.dtos.responses.CopyrightResponse;

public interface CopyrightService extends BaseService<CreateCopyrightRequest> {

    CopyrightResponse getCopyright();

}
