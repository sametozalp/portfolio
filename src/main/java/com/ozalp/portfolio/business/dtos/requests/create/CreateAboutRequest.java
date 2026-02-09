package com.ozalp.portfolio.business.dtos.requests.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAboutRequest {

    private String title;

    private String description;

    private String profileImageUrl;

}
