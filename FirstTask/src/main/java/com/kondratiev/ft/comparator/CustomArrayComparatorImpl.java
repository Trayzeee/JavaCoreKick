package com.kondratiev.ft.comparator;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.service.impl.ArrayServiceImpl;

import java.util.Comparator;

public enum CustomArrayComparatorImpl implements Comparator<CustomArray> {
  BY_ID {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
      return Math.toIntExact(array1.getArrayId() - array2.getArrayId());
    }
  },
  BY_SUM {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
      ArrayServiceImpl service = new ArrayServiceImpl();
      return (service.calculateSum(array1) - service.calculateSum(array2));
    }
  },
  BY_LENGTH {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
      return (array1.getLength() - array2.getLength());
    }
  }
}
