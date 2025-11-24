package com.kondratiev.ft.specification;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;


public interface CustomArraySpecification {
    boolean specify(CustomArray array) throws CustomException;
}
