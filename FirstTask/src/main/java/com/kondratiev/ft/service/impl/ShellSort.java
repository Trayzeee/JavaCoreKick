package com.kondratiev.ft.service.impl;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.service.SortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShellSort implements SortService {
  private static final Logger log = LogManager.getLogger();
  @Override
  public CustomArray sort(CustomArray array) {
      final int[] GAPS = {701, 301, 132, 57, 23, 10, 4, 1};
      int[] newData = array.getData();

        for (int gap : GAPS) {
          for (int i = gap; i < newData.length; i++) {
            int x = newData[i];
            int j = i;
            while (j >= gap && newData[j - gap] > x) {
              newData[j] = newData[j - gap];
              j -= gap;
            }
            newData[j] = x;
          }
        }
        array.setData(newData);
        log.info("Array sorted using shell sort: {}", array.getData());
        return array;
  }
}

