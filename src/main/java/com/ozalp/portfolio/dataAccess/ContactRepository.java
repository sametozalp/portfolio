package com.ozalp.portfolio.dataAccess;

import com.ozalp.portfolio.entities.Contact;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends BaseRepository<Contact, Integer> {
}
