package com.evalladares.pokeapi.commons.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

  private ErrorType type;
  private String message;
  private String code;

  public ErrorResponse() {
  }

  public ErrorResponse(ErrorType type, String message, String code) {
    this.type = type;
    this.message = message;
    this.code = code;
  }

  public ErrorResponse(ErrorType errorType) {
    this.type = errorType;
  }
}
