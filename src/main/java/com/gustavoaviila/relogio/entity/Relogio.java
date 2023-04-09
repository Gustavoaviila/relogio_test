package com.gustavoaviila.relogio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Relogio {

  private Integer hora;
  private Integer minuto;
  private Double angulo;
}
