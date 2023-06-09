package com.evalladares.pokeapi.exception;

public class ServerException extends RuntimeException{

  private static final String DEFAULT_MESSAGE = "Something webt wrong. Try again";

  public ServerException(){
    this(DEFAULT_MESSAGE);
  }

  public ServerException(final String message){
    super(message);
  }
}
