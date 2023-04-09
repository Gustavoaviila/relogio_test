package com.gustavoaviila.relogio.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavoaviila.relogio.dto.RelogioDTO;
import com.gustavoaviila.relogio.service.RelogioService;

@RestController
@RequestMapping("/api/relogio")
public class RelogioResource {

  @Autowired
  private RelogioService service;

  @PostMapping
  public ResponseEntity<RelogioDTO> retornaAnguloRelogio (@RequestBody RelogioDTO relogioDTO){
    return ResponseEntity.ok().body(service.retornaAnguloRelogio(relogioDTO.getHora(), relogioDTO.getMinuto()));
  }
}
