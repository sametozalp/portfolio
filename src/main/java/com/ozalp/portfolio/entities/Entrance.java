package com.ozalp.portfolio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "entrances")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Entrance extends BaseEntity {

    @Column
    private String title;

    @Column
    private String description;

}
