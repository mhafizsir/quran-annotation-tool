package com.quran.annotationtool.controller;

import com.quran.annotationtool.entity.QuranDAO;
import com.quran.annotationtool.service.QuranService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/quran")
public class QuranController {

  private final QuranService quranService;

  @CrossOrigin
  @GetMapping
  public ResponseEntity<List<QuranDAO>> getQuranBySura(@RequestParam("suraid") Integer suraId) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(quranService.findQuranBySuraId(suraId));
  }
}
