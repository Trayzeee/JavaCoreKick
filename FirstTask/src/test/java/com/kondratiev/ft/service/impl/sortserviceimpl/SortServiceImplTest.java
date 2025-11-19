package com.kondratiev.ft.service.impl.sortserviceimpl;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.factory.impl.ArrayExampleFactoryImpl;
import com.kondratiev.ft.service.impl.GnomeSort;
import com.kondratiev.ft.service.impl.InsertionSort;
import com.kondratiev.ft.service.impl.ShellSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceImplTest {

  ArrayExampleFactoryImpl factory = new ArrayExampleFactoryImpl();
  CustomArray array = factory.create(2, new int[]{2, -11, 5, 8, 3, 14, 7});
  CustomArray actual;

  ShellSort shellSortService = new ShellSort();
  GnomeSort gnomeSortService = new GnomeSort();
  InsertionSort insertionSortService = new InsertionSort();

  int[] SORTED_ARRAY = {-11, 2, 3, 5, 7, 8, 14};

  SortServiceImplTest() throws CustomException {}

  @Test
  void sort() {
    int[] expected = SORTED_ARRAY;

    actual = gnomeSortService.sort(array);
    assertArrayEquals(expected, actual.getData());

    actual = shellSortService.sort(array);
    assertArrayEquals(expected, actual.getData());

    actual = insertionSortService.sort(array);
    assertArrayEquals(expected, actual.getData());
  }
}