package com.kondratiev.ft.reader.impl;

import com.kondratiev.ft.exception.CustomException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayReaderImplTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void readFromFile() throws CustomException {
    List<String> list = new ArrayList<>();
    CustomArrayReaderImpl service = new CustomArrayReaderImpl();
    list.add("8; -90;  3 ; 5, 6");
    list.add("");
    list.add("");
    list.add("-567.12; , number; 18");
    list.add("43, 21  ,2, 65; 1");
    list.add("x1, x2, num3");
    assertLinesMatch(list, service.readFromFile("data/arrays.txt"));
  }
}