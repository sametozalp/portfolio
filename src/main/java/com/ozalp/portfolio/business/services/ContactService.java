package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateContactRequest;
import com.ozalp.portfolio.business.dtos.responses.ContactResponse;

public interface ContactService extends BaseService<CreateContactRequest> {

    ContactResponse getContact();

}
