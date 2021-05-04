package com.quran.annotationtool.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "quran")
public class QuranDAO implements Serializable {

  private static final long serialVersionUID = 7692399741574939734L;

  @Id
  private Integer id;
  @Column(insertable = false, updatable = false)
  private Integer aya;
  @Column(insertable = false, updatable = false)
  private Integer sura;
  @Column(insertable = false, updatable = false)
  private Integer position;
  @Column(insertable = false, updatable = false)
  private String text;
  @Column(insertable = false, updatable = false)
  private Integer page;
  @Column(insertable = false, updatable = false)
  private Integer line;
  @Column(insertable = false, updatable = false)
  private String translation;

}
