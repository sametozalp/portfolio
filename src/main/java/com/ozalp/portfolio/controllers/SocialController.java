package com.ozalp.portfolio.controllers;

import com.ozalp.portfolio.business.dtos.requests.CreateSocialRequest;
import com.ozalp.portfolio.business.services.SocialService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/social")
@RequiredArgsConstructor
public class SocialController {

    private final SocialService socialService;

    @PostMapping("/add")
    ResponseEntity<?> add(@RequestBody @Valid CreateSocialRequest request) {
        socialService.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
