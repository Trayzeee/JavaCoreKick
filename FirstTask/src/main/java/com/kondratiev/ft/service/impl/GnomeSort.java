package com.kondratiev.ft.service.impl;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.service.SortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GnomeSort implements SortService {
  private static final Logger log = LogManager.getLogger();
  @Override
  public CustomArray sort(CustomArray array) {
    int[] newData = array.getData();

        int i = 1;

        while (i < newData.length) {
          if (i == 0 || newData[i - 1] <= newData[i]) {
            i++;
          }
          else {
            int temp = newData[i];
            newData[i] = newData[i - 1];
            newData[i - 1] = temp;
            i--;
          }
        }
    array.setData(newData);
    log.info("Array sorted using gnome sort: {}", array.getData());
    return array;
  }
}

