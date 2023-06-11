package com.evalladares.pokeapi.poke.service;

import com.evalladares.pokeapi.commons.exception.ServerException;
import com.evalladares.pokeapi.commons.model.RestResponse;
import com.evalladares.pokeapi.poke.client.PokeClient;
import com.evalladares.pokeapi.poke.model.PokeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PokeService implements IPoke{

  private static final Logger LOG = Logger.getLogger("PokeService");
  private PokeClient pokeClient;

  public PokeService(PokeClient pokeClient){
    this.pokeClient = pokeClient;
  }

  @Override
  public RestResponse<PokeResponse> getPoke(String limit, String offset){
    ResponseEntity<PokeResponse> response = this.pokeClient.postGetPoke();
    return RestResponse.of(response.getBody());
  }

}
