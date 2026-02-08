package com.ozalp.portfolio.business.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCopyrightRequest {

    private String description;

    private int year;
}
