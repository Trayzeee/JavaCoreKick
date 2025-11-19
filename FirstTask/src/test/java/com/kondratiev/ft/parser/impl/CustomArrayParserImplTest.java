package com.kondratiev.ft.parser.impl;

import com.kondratiev.ft.exception.CustomException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayParserImplTest {

  @Test
  void parseToArray() throws CustomException {
    CustomArrayParserImpl service = new CustomArrayParserImpl();
    String lineToParse = "1  , 3, 8, 2, -14";
    int[] expected = {1,3,8,2,-14};
    assertArrayEquals(expected, service.parseToArray(lineToParse));
  }
}