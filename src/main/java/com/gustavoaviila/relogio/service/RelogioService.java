package com.gustavoaviila.relogio.service;

import org.springframework.stereotype.Service;

import com.gustavoaviila.relogio.dto.RelogioDTO;

@Service
public class RelogioService {

  public RelogioDTO retornaAnguloRelogio (Integer hora, Integer minuto) {
    double angulo = Math.abs((60 * hora - 11 * minuto) / 2.0);
    double graus = angulo > 180 ? 360 - angulo : angulo;
    return new RelogioDTO(hora, minuto, angulo);
  }
}
