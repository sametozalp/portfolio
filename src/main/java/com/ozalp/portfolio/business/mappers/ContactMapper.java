package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateContactRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateContactRequest;
import com.ozalp.portfolio.business.dtos.responses.ContactResponse;
import com.ozalp.portfolio.entities.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ContactMapper extends BaseMapper<Contact, CreateContactRequest, ContactResponse> {

    void updateEntity(UpdateContactRequest request, @MappingTarget Contact entity);


}
