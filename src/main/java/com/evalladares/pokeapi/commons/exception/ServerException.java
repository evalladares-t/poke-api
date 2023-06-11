package com.evalladares.pokeapi.commons.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;


public class ServerException extends ResponseStatusException {

  private static final String DEFAULT_MESSAGE = "Something webt wrong. Try again";

  public ServerException(){
    this(HttpStatus.INTERNAL_SERVER_ERROR, DEFAULT_MESSAGE);
  }

  public ServerException(HttpStatus httpStatus, final String message){
    super(httpStatus, message);
  }
}
