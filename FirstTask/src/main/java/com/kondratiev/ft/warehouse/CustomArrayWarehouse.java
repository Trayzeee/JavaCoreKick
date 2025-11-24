package com.kondratiev.ft.warehouse;

import com.kondratiev.ft.service.impl.ArrayServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.kondratiev.ft.entity.CustomArrayStatistics;

import java.util.HashMap;
import java.util.Map;

public class CustomArrayWarehouse {
  public static final Logger logger = LogManager.getLogger();
  private final Map<Integer, CustomArrayStatistics> stats = new HashMap<>();
  private static CustomArrayWarehouse instance;

  private CustomArrayWarehouse() {}

  public static CustomArrayWarehouse getInstance() {
    if(instance == null) {
      instance = new CustomArrayWarehouse();
    }
    return instance;
  }

  public CustomArrayStatistics put(int arrayId, CustomArrayStatistics customArrayParameters) {
    if (customArrayParameters == null) {
      logger.warn("Invalid operation! Insertion of null data in array {} is impermissible", arrayId);
    }
    return stats.put(arrayId, customArrayParameters);
  }

  public CustomArrayStatistics getArrayStats(int id) {
    CustomArrayWarehouse warehouse = new CustomArrayWarehouse();
    logger.info("Statistics of array with id: {}", id);
    logger.info("{}", stats);
    return stats.get(id);
  }

  public void removeArrayStats(int arrayId) {
    logger.info("Statistics of array {} has been deleted", arrayId);
    stats.remove(arrayId);
  }
}