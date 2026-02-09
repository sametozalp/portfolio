package com.ozalp.portfolio.controllers;

import com.ozalp.portfolio.business.dtos.responses.HomeResponse;
import com.ozalp.portfolio.business.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main")
@RequiredArgsConstructor
public class MainController {

    private final AboutService aboutService;
    private final ContactService contactService;
    private final CopyrightService copyrightService;
    private final EducationService educationService;
    private final EntranceService entranceService;
    private final ExperienceService experienceService;
    private final ProjectService projectService;
    private final SkillService skillService;
    private final SocialService socialService;

    @GetMapping
    ResponseEntity<?> main() {
        return ResponseEntity.ok(HomeResponse.builder()
                .about(aboutService.getAbout())
                .contact(contactService.getContact())
                .copyright(copyrightService.getCopyright())
                .educations(educationService.getEducations())
                .entrance(entranceService.getEntrance())
                .experiences(experienceService.getExperience())
                .projects(projectService.getProjects())
                .skills(skillService.getSkills())
                .socials(socialService.getSocials())
                .build());
    }
}
