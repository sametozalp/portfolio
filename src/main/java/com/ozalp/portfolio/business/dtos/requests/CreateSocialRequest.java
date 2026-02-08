package com.ozalp.portfolio.business.dtos.requests;

import com.ozalp.portfolio.business.enums.SocialMedia;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSocialRequest {

    private SocialMedia socialMedia;

    private String url;
}
