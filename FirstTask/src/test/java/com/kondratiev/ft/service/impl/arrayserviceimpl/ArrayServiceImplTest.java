package com.kondratiev.ft.service.impl.arrayserviceimpl;

import com.kondratiev.ft.entity.ArrayExample;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.factory.impl.ArrayExampleFactoryImpl;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceImplTest {

  ArrayExampleFactoryImpl factory = new ArrayExampleFactoryImpl();
  ArrayExample array = factory.create(5, new int[]{4, 8, 7, 1, 0});
  ArrayServiceImpl service = new ArrayServiceImpl();

  final int MIN_VALUE = -7;
  final int MAX_VALUE = 6;
  final double AVERAGE = 0.8;
  final int SUM = 4;
  final int NEGATIVE_ELEMENTS_QUANTITY = 1;
  final int POSITIVE_ELEMENTS_QUANTITY = 3;

  ArrayServiceImplTest() throws CustomException {}

  @Test
  void findMaxElement() {
    int expected = MAX_VALUE;
    int actual = service.findMaxElement(array);
    assertEquals(expected, actual);
  }

  @Test
  void findMinElement() {
    int expected = MIN_VALUE;
    int actual = service.findMinElement(array);
    assertEquals(expected, actual);
  }

  @Test
  void substituteElement() {
    int value = 18;
    int pos = 0;
    service.substituteElement(array, 18, 0);
    int[] data = array.getData();
    assertEquals(value, data[pos]);
  }

  @Test
  void calculateAverage() {
    double expected = AVERAGE;
    double actual = service.calculateAverage(array);
    assertEquals(expected, actual);
  }

  @Test
  void calculateSum() {
    int expected = SUM;
    int actual = service.calculateSum(array);
    assertEquals(expected, actual);
  }

  @Test
  void calculateQuantityOfNegativeElements() {
    int expected = NEGATIVE_ELEMENTS_QUANTITY;
    int actual = service.calculateQuantityOfNegativeElements(array);
    assertEquals(expected, actual);
  }

  @Test
  void calculateQuantityOfPositiveElements() {
    int expected = POSITIVE_ELEMENTS_QUANTITY;
    int actual = service.calculateQuantityOfPositiveElements(array);
    assertEquals(expected, actual);
  }
}