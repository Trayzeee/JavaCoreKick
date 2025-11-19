package com.kondratiev.ft.observer.impl;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.observer.CustomArrayObserver;
import com.kondratiev.ft.service.impl.ArrayServiceImpl;
import com.kondratiev.ft.stats.CustomArrayStats;
import com.kondratiev.ft.warehouse.CustomArrayWarehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayObserverImpl implements CustomArrayObserver {
  private static final Logger log = LogManager.getLogger();

  @Override
  public void updateArray(CustomArray array) {
    CustomArrayWarehouse wareHouse = CustomArrayWarehouse.getInstance();
    ArrayServiceImpl service = new ArrayServiceImpl();

    try {
      CustomArrayStats arrayStats = new CustomArrayStats(
              service.findMinElement(array),
              service.findMaxElement(array),
              service.calculateAverage(array),
              service.calculateSum(array),
              service.calculateQuantityOfNegativeElements(array),
              service.calculateQuantityOfPositiveElements(array)
      );

      wareHouse.put(array.getArrayId(), arrayStats);

      log.info("Parameters of array {} have been updated successfully", array.getArrayId());
    } catch (CustomException e) {
      log.error("An error occured while operating array {}: {}",
              array.getArrayId(), e.getMessage());
    }
  }
}
