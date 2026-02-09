package com.ozalp.portfolio.business.dtos.requests.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateAboutRequest {

    private String title;

    private String description;

    private String profileImageUrl;

}
