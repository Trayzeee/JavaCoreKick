package com.kondratiev.ft.service.impl.sortserviceimpl;

import com.kondratiev.ft.entity.ArrayExample;
import com.kondratiev.ft.service.SortService;

public class InsertionSort implements SortService {

  @Override
  public ArrayExample sort(ArrayExample array) {
    int[] newData = array.getData();
    int size = array.getSize();

    for (int i = 1; i < size; i++) {

      int x = newData[i];
      int j = i - 1;

      while (j >= 0 && newData[j] > x) {
        newData[j + 1] = newData[j];
        j--;
      }
      newData[j + 1] = x;
    }
    array.setData(newData);
    return array;
  }
}
