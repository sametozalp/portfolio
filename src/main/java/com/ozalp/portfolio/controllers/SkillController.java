package com.ozalp.portfolio.controllers;

import com.ozalp.portfolio.business.dtos.requests.CreateSkillRequest;
import com.ozalp.portfolio.business.services.SkillService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService skillService;

    @PostMapping("/add")
    ResponseEntity<?> add(@RequestBody @Valid CreateSkillRequest request) {
        skillService.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
