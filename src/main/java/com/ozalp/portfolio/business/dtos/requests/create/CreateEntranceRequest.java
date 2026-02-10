package com.ozalp.portfolio.business.dtos.requests.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateEntranceRequest {

    private String title;

    private String description;

    private String fullName;

}
