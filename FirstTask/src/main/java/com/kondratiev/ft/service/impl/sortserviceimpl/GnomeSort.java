package com.kondratiev.ft.service.impl.sortserviceimpl;

import com.kondratiev.ft.entity.ArrayExample;
import com.kondratiev.ft.service.SortService;

public class GnomeSort implements SortService {
  @Override
  public ArrayExample sort(ArrayExample array) {
    int[] newData = array.getData();
    int size = array.getSize();

        int i = 1;

        while (i < size) {
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
    return array;
  }
}

