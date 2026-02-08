package com.ozalp.portfolio.controllers;

import com.ozalp.portfolio.business.dtos.requests.CreateContactRequest;
import com.ozalp.portfolio.business.services.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping("/add")
    ResponseEntity<?> add(@RequestBody @Valid CreateContactRequest request) {
        contactService.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
