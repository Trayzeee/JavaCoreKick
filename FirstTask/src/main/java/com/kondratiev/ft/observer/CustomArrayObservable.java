package com.kondratiev.ft.observer;

import com.kondratiev.ft.entity.CustomArray;
import com.kondratiev.ft.exception.CustomException;

public interface CustomArrayObservable {
    void updateArray(CustomArray array) throws CustomException;
    void addObserver(CustomArrayObservable observer) throws CustomException;
    void removeObserver(CustomArrayObservable observer) throws CustomException;
    void notifyObserver() throws CustomException;
}
