package com.kondratiev.ft.validator.impl;

import com.kondratiev.ft.validator.CustomArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class CustomArrayValidatorImpl implements CustomArrayValidator {
  private static final Logger log = LogManager.getLogger();
  private static final Pattern pattern = Pattern.compile(LINE_FROM_FILE_REGEX);

  @Override
  public boolean isLineValid(String stringToValidate) {
    if (stringToValidate == null || stringToValidate.isEmpty()) {
      log.warn("This line is empty");
      return false;
    }
    return pattern.matcher(stringToValidate).matches();
  }
}
