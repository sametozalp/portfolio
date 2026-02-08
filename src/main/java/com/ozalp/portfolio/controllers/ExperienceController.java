package com.ozalp.portfolio.controllers;

import com.ozalp.portfolio.business.dtos.requests.CreateExperienceRequest;
import com.ozalp.portfolio.business.services.ExperienceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/experience")
@RequiredArgsConstructor
public class ExperienceController {

    private final ExperienceService experienceService;

    @PostMapping("/add")
    ResponseEntity<?> add(@RequestBody @Valid CreateExperienceRequest request) {
        experienceService.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
