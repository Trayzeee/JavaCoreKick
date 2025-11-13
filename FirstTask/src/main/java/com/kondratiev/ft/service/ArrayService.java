package com.kondratiev.ft.service;

import com.kondratiev.ft.entity.ArrayExample;

public interface ArrayService
{
   int findMaxElement (ArrayExample array);

   int findMinElement (ArrayExample array);

   void substituteElement (ArrayExample array, int element, int pos);

   double calculateAverage (ArrayExample array);

   int calculateSum (ArrayExample array);

   int calculateQuantityOfNegativeElements (ArrayExample array);

   int calculateQuantityOfPositiveElements (ArrayExample array);

}
