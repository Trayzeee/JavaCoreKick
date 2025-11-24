package com.kondratiev.ft.validator;

public interface CustomArrayValidator {
    String LINE_FROM_ARRAY_FILE_REGEX = "-?\\d+(\\s*[;,]\\s*-?\\d+)*";
    boolean isLineValid (String stringToValidate);
}
