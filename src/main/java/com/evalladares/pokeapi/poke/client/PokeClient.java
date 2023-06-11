package com.evalladares.pokeapi.poke.client;

import com.evalladares.pokeapi.commons.exception.ServerException;
import com.evalladares.pokeapi.constants.ErrorMessageUtils;
import com.evalladares.pokeapi.poke.model.PokeResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.logging.Logger;

@Component
public class PokeClient {

  private static final Logger LOG = Logger.getLogger("PokeClient");
  private RestTemplate restTemplate ;

  public PokeClient(RestTemplate  restTemplate){
    this.restTemplate = restTemplate;
  }

  public ResponseEntity<PokeResponse> postGetPoke(){
    //String apiUrl = "https://pokeapi.co/api/v2/pokemon?limit=".concat(limit + "&offset=").concat(offset);
    String apiUrl = "https://evalladares.free.beeceptor.com/error";
    //String apiUrl = "https://pokeapi.co/api/v2/pokemon";
    URI uri = URI.create(apiUrl);
    RequestEntity.BodyBuilder requestBuilder = RequestEntity.method(HttpMethod.GET, uri);
    RequestEntity requestEntity = requestBuilder.build();

    try {
      return this.restTemplate.exchange(apiUrl, HttpMethod.GET, requestEntity, PokeResponse.class);
    }
    catch (HttpClientErrorException exception){
      throw new ServerException(HttpStatus.resolve(exception.getStatusCode().value()) , ErrorMessageUtils.GENERAL_ERROR);
    }

  }
}
