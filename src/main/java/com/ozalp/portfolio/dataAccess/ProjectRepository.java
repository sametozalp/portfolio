package com.ozalp.portfolio.dataAccess;

import com.ozalp.portfolio.entities.Project;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends BaseRepository<Project, Integer> {
}
