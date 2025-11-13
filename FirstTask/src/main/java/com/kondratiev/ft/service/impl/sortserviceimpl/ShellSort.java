package com.kondratiev.ft.service.impl.sortserviceimpl;

import com.kondratiev.ft.entity.ArrayExample;
import com.kondratiev.ft.service.SortService;

public class ShellSort implements SortService {

  @Override
  public ArrayExample sort(ArrayExample array) {
      final int[] GAPS = {701, 301, 132, 57, 23, 10, 4, 1};
      int[] newData = array.getData();
      int size = array.getSize();

        for (int gap : GAPS) {
          for (int i = gap; i < size; i++) {
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
        return array;
  }
}

