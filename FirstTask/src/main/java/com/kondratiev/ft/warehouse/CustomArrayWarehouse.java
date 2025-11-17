package com.kondratiev.ft.warehouse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.kondratiev.ft.stats.CustomArrayStats;

import java.util.HashMap;
import java.util.Map;

public class CustomArrayWarehouse {
  public static final Logger logger = LogManager.getLogger();
  private final Map<Long, CustomArrayStats> stats = new HashMap<>();
  private static CustomArrayWarehouse instance;

  private CustomArrayWarehouse() {}

  public static CustomArrayWarehouse getInstance() {
    if(instance == null) {
      instance = new CustomArrayWarehouse();
    }
    return instance;
  }

  public CustomArrayStats put(Long arrayId, CustomArrayStats customArrayParameters) {
    if (customArrayParameters == null) {
      logger.warn("Invalid operation! Insertion of null data in array {} is impermissible", arrayId);
    }
    return stats.put(arrayId, customArrayParameters);
  }
  public void removeArrayStats(long arrayId) {
    logger.info("remove stats of array with id: {}", arrayId);
    stats.remove(arrayId);
  }
}