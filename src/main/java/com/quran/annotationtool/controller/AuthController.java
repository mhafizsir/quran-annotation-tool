package com.quran.annotationtool.controller;

import com.quran.annotationtool.entity.PersonDAO;
import com.quran.annotationtool.payload.AuthDTO;
import com.quran.annotationtool.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/auth")
public class AuthController {

  private final PersonRepository personRepository;

  @CrossOrigin
  @PostMapping("/login")
  public AuthDTO login(AuthDTO param) {
    PersonDAO byEmail = personRepository.findByEmail(param.getEmail());
    return AuthDTO.builder()
        .email(byEmail.getEmail())
        .name(byEmail.getName())
        .token(byEmail.getId())
        .build();
  }
}
