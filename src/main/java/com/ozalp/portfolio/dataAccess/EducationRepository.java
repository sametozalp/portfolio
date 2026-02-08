package com.ozalp.portfolio.dataAccess;

import com.ozalp.portfolio.entities.Education;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends BaseRepository<Education, Integer> {
}
