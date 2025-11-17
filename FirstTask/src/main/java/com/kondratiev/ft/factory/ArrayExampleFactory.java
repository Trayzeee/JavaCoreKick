package com.kondratiev.ft.factory;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;

public interface ArrayExampleFactory {
  CustomArray create(long arrayId, int size, int[] data) throws CustomException;
}
