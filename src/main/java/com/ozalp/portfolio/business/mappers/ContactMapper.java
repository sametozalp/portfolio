package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.CreateContactRequest;
import com.ozalp.portfolio.business.dtos.responses.ContactResponse;
import com.ozalp.portfolio.entities.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactMapper extends BaseMapper<Contact, CreateContactRequest, ContactResponse> {
}
