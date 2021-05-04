package com.quran.annotationtool.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthDTO {

  private String email;
  private String password;
  private String token;
  private String name;
}
