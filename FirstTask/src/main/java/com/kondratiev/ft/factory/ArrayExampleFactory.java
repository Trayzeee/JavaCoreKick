package com.kondratiev.ft.factory;

import com.kondratiev.ft.entity.ArrayExample;
import com.kondratiev.ft.exception.CustomException;

public interface ArrayExampleFactory {
  ArrayExample create(int size, int[] data) throws CustomException;
}
