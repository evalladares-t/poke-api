package com.evalladares.pokeapi.service;

import com.evalladares.pokeapi.client.PokeClient;
import com.evalladares.pokeapi.model.PokeResponse;
import org.springframework.stereotype.Service;

@Service
public class PokeService implements IPoke{

  private PokeClient pokeClient;

  public PokeService(PokeClient pokeClient){
    this.pokeClient = pokeClient;
  }
  public PokeResponse getPoke(String limit, String offset){
    return this.pokeClient.postGetPoke();
  }
}
