package com.ozalp.portfolio.dataAccess;

import com.ozalp.portfolio.entities.ProjectCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectCategoryRepository extends BaseRepository<ProjectCategory, Integer> {
}
