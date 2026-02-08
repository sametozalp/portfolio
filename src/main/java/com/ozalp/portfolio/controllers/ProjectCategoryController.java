package com.ozalp.portfolio.controllers;

import com.ozalp.portfolio.business.dtos.requests.CreateProjectCategoryRequest;
import com.ozalp.portfolio.business.services.ProjectCategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projectCategory")
@RequiredArgsConstructor
public class ProjectCategoryController {

    private final ProjectCategoryService projectCategoryService;

    @PostMapping("/add")
    ResponseEntity<?> add(@RequestBody @Valid CreateProjectCategoryRequest request) {
        projectCategoryService.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
