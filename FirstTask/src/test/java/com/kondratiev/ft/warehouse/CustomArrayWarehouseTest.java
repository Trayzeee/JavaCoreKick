package com.kondratiev.ft.warehouse;

import com.kondratiev.ft.entity.CustomArrayStatistics;
import com.kondratiev.ft.warehouse.CustomArrayWarehouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomArrayWareHouseTest {

  @Test
  void testSingleton() {
    CustomArrayWarehouse first = CustomArrayWarehouse.getInstance();
    CustomArrayWarehouse second = CustomArrayWarehouse.getInstance();
    assertSame(first, second);
  }

  @Test
  void testPut() {
    CustomArrayWarehouse warehouse = CustomArrayWarehouse.getInstance();
    CustomArrayStatistics stats = new CustomArrayStatistics(1, 10, 5.5, 22, 2, 1);

    warehouse.put(1, stats);
    CustomArrayStatistics result = warehouse.getArrayStats(1);

    assertEquals(stats, result);
  }
}