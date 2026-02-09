package com.ozalp.portfolio.business.dtos.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class HomeResponse {

    private AboutResponse about;
    private ContactResponse contact;
    private CopyrightResponse copyright;
    private List<EducationResponse> educations;
    private EntranceResponse entrance;
    private List<ExperienceResponse> experiences;
    private ProjectCategoryResponse projectCategory;
    private List<ProjectResponse> projects;
    private List<SkillResponse> skills;
    private List<SocialResponse> socials;
}
