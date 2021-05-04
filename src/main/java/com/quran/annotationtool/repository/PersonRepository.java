package com.quran.annotationtool.repository;

import com.quran.annotationtool.entity.PersonDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDAO, String> {

  PersonDAO findByEmail(String email);
}
