package com.ozalp.portfolio.controllers;

import com.ozalp.portfolio.business.dtos.requests.CreateEntranceRequest;
import com.ozalp.portfolio.business.services.EntranceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entrance")
@RequiredArgsConstructor
public class EntranceController {

    private final EntranceService entranceService;

    @PostMapping("/add")
    ResponseEntity<?> add(@RequestBody @Valid CreateEntranceRequest request) {
        entranceService.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
