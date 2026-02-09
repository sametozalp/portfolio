package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateContactRequest;
import com.ozalp.portfolio.business.dtos.responses.ContactResponse;
import com.ozalp.portfolio.entities.Contact;

public interface ContactService extends BaseService<CreateContactRequest, Contact> {

    ContactResponse getContact();

}
