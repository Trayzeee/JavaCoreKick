package com.kondratiev.ft.parser;

import com.kondratiev.ft.exception.CustomException;

import java.util.List;

public interface CustomArrayParser {
    String DATA_SPLIT_REGEX = "\\s*[;,]\\s*";
    int[] parseToArray(String lineFromFile) throws CustomException;
}
