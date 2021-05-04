package com.quran.annotationtool.repository;

import com.quran.annotationtool.entity.QuranDAO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuranRepository extends JpaRepository<QuranDAO, Integer> {

  List<QuranDAO> findBySura(Integer sura);

  List<QuranDAO> findByPage(Integer page);
}
