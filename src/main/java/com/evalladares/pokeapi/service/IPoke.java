package com.evalladares.pokeapi.service;

import com.evalladares.pokeapi.model.PokeResponse;

public interface IPoke {

  PokeResponse getPoke(String limit, String offset);

}
