package com.kondratiev.ft.factory.impl;

import com.kondratiev.ft.entity.ArrayExample;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.factory.ArrayExampleFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayExampleFactoryImpl implements ArrayExampleFactory {
  private static final Logger log = LogManager.getLogger(ArrayExampleFactoryImpl.class);

  @Override
  public ArrayExample create(int size, int[] source) throws CustomException {
    ArrayExample result = new ArrayExample(size, source);
    log.info("Array created, contains {} elements", result.getSize());
    log.info("Array: {}", result.getData());
    return result;
  }

}
