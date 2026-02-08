package com.ozalp.portfolio.business.managers;

import com.ozalp.portfolio.business.dtos.requests.CreateContactRequest;
import com.ozalp.portfolio.business.dtos.responses.ContactResponse;
import com.ozalp.portfolio.business.exeptions.errors.DataAlreadyExist;
import com.ozalp.portfolio.business.mappers.ContactMapper;
import com.ozalp.portfolio.business.services.ContactService;
import com.ozalp.portfolio.dataAccess.ContactRepository;
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

    }

    @Override
    public void setShowable(Boolean value) {

    }

    @Override
    public ContactResponse getContact() {
        return repository.findAllByDeletedAtIsNullAndShowableIsTrue(PageRequest.of(0, 1))
                .stream()
                .map(mapper::toResponse)
                .toList()
                .getFirst();    }
}
