package com.kondratiev.ft.service.impl;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.service.SortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertionSort implements SortService {
  private static final Logger log = LogManager.getLogger();
  @Override
  public CustomArray sort(CustomArray array) {
    int[] newData = array.getData();

    for (int i = 1; i < newData.length; i++) {

      int x = newData[i];
      int j = i - 1;

      while (j >= 0 && newData[j] > x) {
        newData[j + 1] = newData[j];
        j--;
      }
      newData[j + 1] = x;
    }
    array.setData(newData);
    log.info("Array sorted using insertion sort: {}", array.getData());
    return array;
  }
}
