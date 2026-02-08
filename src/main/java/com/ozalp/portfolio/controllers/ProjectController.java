package com.ozalp.portfolio.controllers;

import com.ozalp.portfolio.business.dtos.requests.CreateProjectRequest;
import com.ozalp.portfolio.business.services.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping("/add")
    ResponseEntity<?> add(@RequestBody @Valid CreateProjectRequest request) {
        projectService.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
