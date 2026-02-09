package com.ozalp.portfolio.business.dtos.requests.update;

import com.ozalp.portfolio.business.enums.SocialMedia;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSocialRequest {

    private SocialMedia socialMedia;

    private String url;
}
