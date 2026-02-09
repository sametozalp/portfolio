package com.ozalp.portfolio.business.dtos.requests.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateContactRequest {

    private String title;

    private String description;

    private String myEmail;

}
