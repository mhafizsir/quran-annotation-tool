package com.quran.annotationtool.service;

import com.quran.annotationtool.entity.QuranDAO;
import com.quran.annotationtool.repository.QuranRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class QuranService {

  private final QuranRepository quranRepository;

  public QuranService(QuranRepository quranRepository) {
    this.quranRepository = quranRepository;
  }

  public List<QuranDAO> findQuranBySuraId(Integer sura) {
    return quranRepository.findBySura(sura);
  }
}
