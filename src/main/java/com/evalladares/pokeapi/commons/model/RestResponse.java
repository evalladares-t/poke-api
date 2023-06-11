package com.evalladares.pokeapi.commons.model;

import java.util.Optional;

public class RestResponse<T> {

  protected final T data;

  public Optional<T> get(){
    return Optional.ofNullable(this.data);
  }

  public Boolean isPresent (){
    return this.data != null;
  }

  public static <T> RestResponse<T> of(final T value){
    return new RestResponse<>(value);
  }

  public RestResponse(final T data){
    this.data = data;
  }
}
