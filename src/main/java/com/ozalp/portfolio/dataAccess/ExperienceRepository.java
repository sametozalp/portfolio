package com.ozalp.portfolio.dataAccess;

import com.ozalp.portfolio.entities.Experience;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends BaseRepository<Experience, Integer> {
}
