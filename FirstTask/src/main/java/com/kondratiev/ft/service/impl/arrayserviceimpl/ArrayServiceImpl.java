package com.kondratiev.ft.service.impl.arrayserviceimpl;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayServiceImpl implements ArrayService {
  private static final Logger log = LogManager.getLogger(ArrayServiceImpl.class);
  @Override
  public int findMaxElement(CustomArray array) {

    int[] data = array.getData();
    int size = array.getSize();
    int maxElement = data[0];

    for (int i = 1; i < size; i++) {
      if (maxElement < data[i]) {
        maxElement = data[i];
      }
    }

    return maxElement;
  }

  @Override
  public int findMinElement(CustomArray array) {

    int[] data = array.getData();
    int size = array.getSize();
    int minElement = data[0];

    for (int i = 1; i < size; i++) {
      if (minElement > data[i]) {
        minElement = data[i];
      }
    }

    return minElement;
  }

  @Override
  public void substituteElement(CustomArray array, int element, int pos) {

    int[] data = array.getData();
    int size = array.getSize();
    data[pos] = element;

    array.setData(data);
    array.setSize(size);
    log.info("Array updated: element {} was set to position {}", element, pos);
    log.info("Array: {}", array.getData());
  }

  @Override
  public double calculateAverage(CustomArray array) {

    int[] data = array.getData();
    int size = array.getSize();
    double sum = 0, count = 0, average;

    for (int i = 0; i < size; i++) {
      sum += data[i];
      count++;
    }

    average = sum / count;
    return average;
  }

  @Override
  public int calculateSum(CustomArray array) {

    int[] data = array.getData();
    int size = array.getSize();
    int sum = 0;

    for (int i = 0; i < size; i++) {
      sum += data[i];
    }

    return sum;
  }

  @Override
  public int calculateQuantityOfNegativeElements(CustomArray array) {

    int[] data = array.getData();
    int size = array.getSize();
    int quantity = 0;

    for (int i = 0; i < size; i++) {

      if (data[i] < 0) {
        quantity++;
      }
    }

    return quantity;
  }

  @Override
  public int calculateQuantityOfPositiveElements(CustomArray array) throws CustomException {

    int[] data = array.getData();
    int size = array.getSize();
    int quantity = 0;

    for (int i = 0; i < size; i++) {
      if (data[i] > 0) {
        quantity++;
      }
    }

    return quantity;
  }

}
