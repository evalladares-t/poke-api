package com.evalladares.pokeapi.commons.exception;

import com.evalladares.pokeapi.constants.ErrorMessageUtils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.logging.Logger;

@RestControllerAdvice
public class ControllerAdvice {

  private static final Logger LOG = Logger.getLogger("ControllerAdvice");

  @ExceptionHandler(ServerException.class)
  public ResponseEntity serverException (ServerException ex){
    ErrorResponse errorResponse = new ErrorResponse(ErrorType.API_ERROR, ex.getReason(), ex.getStatusCode() + "");
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
  }
}
