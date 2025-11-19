package com.kondratiev.ft.validator.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayValidatorImplTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void isLineValid() {
    CustomArrayValidatorImpl service = new CustomArrayValidatorImpl();
    String lineToValidate = "2, 4, -0, 20, 15";
    int expected = 1;
    assertEquals(1, service.isLineValid(lineToValidate) ? 1 : 0);
  }
}