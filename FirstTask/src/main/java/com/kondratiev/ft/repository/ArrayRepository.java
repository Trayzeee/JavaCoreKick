package com.kondratiev.ft.repository;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.warehouse.CustomArrayWarehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayRepository {
    public static final Logger logger = LogManager.getLogger();
    private static ArrayRepository instance;

    private final List<CustomArray> arrays = new ArrayList<>();

    private ArrayRepository() {}

    public static ArrayRepository getInstance() {
      if(instance == null) {
        instance = new ArrayRepository();
      }
      return instance;
    }

    public void add(CustomArray customArray) throws CustomException {
      if (customArray == null) {
        throw new CustomException("Can't add an array with null data to repository!");
      }

      logger.debug("Custom array added to repository: {}",customArray);
      arrays.add(customArray);
    }

    public void remove(CustomArray customArray) throws CustomException {
      if (customArray == null) {
        throw new CustomException("Can't remove an array with null data from repository!");
      }
      logger.info("Custom array deleted from repository: {}", customArray);
      CustomArrayWarehouse.getInstance().removeArrayStats(customArray.getArrayId());
      arrays.remove(customArray);
    }

    public List<CustomArray> sort() throws UnsupportedOperationException {
       // TODO
       return List.of();
    }

    public List<CustomArray> query() throws UnsupportedOperationException {
       // TODO
      return List.of();
    }

    public List<CustomArray> findAll() throws UnsupportedOperationException {
      // TODO
      return List.of();
    }
}
