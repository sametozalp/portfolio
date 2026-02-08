package com.ozalp.portfolio.entities;

import com.ozalp.portfolio.business.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "auths")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Auth extends BaseEntity {

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private Role role;

}
