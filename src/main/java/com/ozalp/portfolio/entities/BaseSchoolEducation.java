package com.ozalp.portfolio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "school_education")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BaseSchoolEducation extends BaseEntity {

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;
}
