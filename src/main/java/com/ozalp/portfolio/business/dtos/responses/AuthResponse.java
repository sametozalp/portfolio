package com.ozalp.portfolio.business.dtos.responses;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthResponse {

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

}
