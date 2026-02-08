package com.ozalp.portfolio.dataAccess;

import com.ozalp.portfolio.entities.Auth;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends BaseRepository<Auth, Integer> {
}
