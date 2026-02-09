package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.create.CreateContactRequest;
import com.ozalp.portfolio.business.dtos.requests.update.UpdateContactRequest;
import com.ozalp.portfolio.business.dtos.responses.ContactResponse;
import com.ozalp.portfolio.business.exeptions.errors.DataAlreadyExist;
import com.ozalp.portfolio.business.mappers.ContactMapper;
import com.ozalp.portfolio.business.services.ContactService;
import com.ozalp.portfolio.dataAccess.ContactRepository;
import com.ozalp.portfolio.entities.Contact;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactManager implements ContactService {

    private final ContactRepository repository;
    private final ContactMapper mapper;

    @Override
    public void add(CreateContactRequest createContactRequest) {
        if (!repository.findAllByDeletedAtIsNullAndShowableIsTrue().isEmpty()) {
            throw new DataAlreadyExist();
        }
        repository.save(mapper.toEntity(createContactRequest));
    }

    @Override
    public void delete(int id) {
        var entity = findById(id);
        entity.markAsDeleted();
        repository.save(entity);

    }

    @Override
    public void setShowable(int id, Boolean value) {
        Contact contact = findById(id);
        contact.setShowable(value);
        repository.save(contact);
    }

    @Override
    public Contact findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Not found"));
    }

    @Override
    public ContactResponse getContact() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue(PageRequest.of(0, 1))
                .stream()
                .map(mapper::toResponse)
                .toList()
                .getFirst();    }

    @Override
    public void update(int id, UpdateContactRequest request) {
        var entity = findById(id);
        mapper.updateEntity(request, entity);
        repository.save(entity);
    }
}
