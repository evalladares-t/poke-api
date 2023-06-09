package com.evalladares.pokeapi.client;

import com.evalladares.pokeapi.model.PokeResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class PokeClient {

  private RestTemplate restTemplate ;

  public PokeClient(RestTemplate  restTemplate){
    this.restTemplate = restTemplate;
  }

  public PokeResponse postGetPoke(){
    String apiUrl = "https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0";
    URI uri = URI.create(apiUrl);
    RequestEntity.BodyBuilder requestBuilder = RequestEntity.method(HttpMethod.GET, uri);
    RequestEntity requestEntity = requestBuilder.build();

    ResponseEntity<PokeResponse> response = this.restTemplate.exchange(apiUrl, HttpMethod.GET, requestEntity, PokeResponse.class);
    return response.getBody();

  }
}
