package com.evalladares.pokeapi.poke.service;

import com.evalladares.pokeapi.commons.model.RestResponse;
import com.evalladares.pokeapi.poke.model.PokeResponse;

public interface IPoke {

  RestResponse<PokeResponse> getPoke(String limit, String offset);

}
