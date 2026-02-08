package com.ozalp.portfolio.business.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class CreateExperienceRequest {

    private String title;

    private String description;

    private String company;

    private LocalDate startDate;

    private LocalDate endDate;


}
