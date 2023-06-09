package com.evalladares.pokeapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PokeResponse {

  private int count;
  private int next;
  private int previous;
  private List<PokeResult> results;
}
