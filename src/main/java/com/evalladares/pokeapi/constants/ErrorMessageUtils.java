package com.evalladares.pokeapi.constants;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;

public final class ErrorMessageUtils {

  public static final String GENERAL_ERROR = "general.error";

  public static final String INVALID_DATA = "msg.general.invalid.data";

  public static final String POKE_INVALID = "msg.poke.invalid";

  public static String getMessage(MessageSource messageSource, String code){
    try {
      return messageSource.getMessage(code, null, null, LocaleContextHolder.getLocale());
    } catch (NoSuchMessageException ex){
      return null;
    }
  }
}
