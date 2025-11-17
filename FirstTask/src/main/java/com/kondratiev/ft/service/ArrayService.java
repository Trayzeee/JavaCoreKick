package com.kondratiev.ft.service;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;

public interface ArrayService
{
   int findMaxElement (CustomArray array) throws CustomException;

   int findMinElement (CustomArray array) throws CustomException;

   void substituteElement (CustomArray array, int element, int pos) throws CustomException;

   double calculateAverage (CustomArray array) throws CustomException;

   int calculateSum (CustomArray array) throws CustomException;

   int calculateQuantityOfNegativeElements (CustomArray array) throws CustomException;

   int calculateQuantityOfPositiveElements (CustomArray array) throws CustomException;

}
