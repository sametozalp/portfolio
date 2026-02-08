package com.ozalp.portfolio.business.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateContactRequest {

    private String title;

    private String description;

    private String myEmail;

}
