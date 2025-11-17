package com.kondratiev.ft.parser;

import java.util.List;

public interface CustomArrayParser {
    String DATA_SPLIT_REGEX = "\\s*[;,]\\s*";
    int[] parseToArray(List<String> linesFromFile);
}
