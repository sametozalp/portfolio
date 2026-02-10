package com.ozalp.portfolio.business.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailContactRequest {

    private String name;

    private String email;

    private String message;
}
