package com.ozalp.portfolio.business.dtos.requests;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAuthRequest {

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

}
