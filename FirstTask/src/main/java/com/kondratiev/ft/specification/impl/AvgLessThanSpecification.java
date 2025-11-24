package com.kondratiev.ft.specification.impl;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.service.ArrayService;
import com.kondratiev.ft.service.impl.ArrayServiceImpl;
import com.kondratiev.ft.specification.CustomArraySpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public record AvgLessThanSpecification (int avg) implements CustomArraySpecification {
  private static final Logger log = LogManager.getLogger();
  @Override
  public boolean specify(CustomArray array) throws CustomException {
    log.info("Calculating array avg: {}", this.avg);
    ArrayService service = new ArrayServiceImpl();
    return service.calculateAverage(array) > this.avg;
  }
}
