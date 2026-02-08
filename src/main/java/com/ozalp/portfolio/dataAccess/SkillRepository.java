package com.ozalp.portfolio.dataAccess;

import com.ozalp.portfolio.entities.Skill;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends BaseRepository<Skill, Integer> {
}
