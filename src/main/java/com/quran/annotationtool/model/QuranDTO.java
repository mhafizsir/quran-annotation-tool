package com.quran.annotationtool.model;

import lombok.Data;

@Data
public class QuranDTO {

  private Integer id;
  private Integer aya;
  private Integer sura;
  private Integer position;
  private String text;
  private Integer page;
  private Integer line;
  private String translation;

}
