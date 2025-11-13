package com.kondratiev.ft.service.impl.sortserviceimpl;

import com.kondratiev.ft.entity.ArrayExample;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.factory.impl.ArrayExampleFactoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceImplTest {
  private static final Logger log = LogManager.getLogger(ArrayExampleFactoryImpl.class);

  ArrayExampleFactoryImpl factory = new ArrayExampleFactoryImpl();
  ArrayExample array = factory.create(7, new int[]{2, -11, 5, 8, 3, 14, 7});
  ArrayExample actual;

  ShellSort shellSortService = new ShellSort();
  GnomeSort gnomeSortService = new GnomeSort();
  InsertionSort insertionSortService = new InsertionSort();

  int[] SORTED_ARRAY = {-11, 2, 3, 5, 7, 8, 14};

  SortServiceImplTest() throws CustomException {}

  @Test
  void sort() {
    int[] expected = SORTED_ARRAY;

    log.info("Testing gnome sort...");
    actual = gnomeSortService.sort(array);
    assertArrayEquals(expected, actual.getData());

    log.info("Testing shell sort...");
    actual = shellSortService.sort(array);
    assertArrayEquals(expected, actual.getData());

    log.info("Testing shell sort...");
    actual = insertionSortService.sort(array);
    assertArrayEquals(expected, actual.getData());
  }
}