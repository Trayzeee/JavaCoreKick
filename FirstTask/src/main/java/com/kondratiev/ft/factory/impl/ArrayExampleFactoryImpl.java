package com.kondratiev.ft.factory.impl;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.factory.ArrayExampleFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayExampleFactoryImpl implements ArrayExampleFactory {
  private static final Logger log = LogManager.getLogger();

  @Override
  public CustomArray create(int arrayId, int[] data) throws CustomException {
    CustomArray result = new CustomArray(arrayId, data);
    log.info("Array created, contains {} elements", data.length);
    log.info("Array: {}", result.getData());
    return result;
  }

}
