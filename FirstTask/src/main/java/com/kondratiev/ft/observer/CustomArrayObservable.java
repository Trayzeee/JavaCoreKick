package com.kondratiev.ft.observer;

public interface CustomArrayObservable {
  void addObserver(CustomArrayObserver observer);
  void removeObserver(CustomArrayObserver observer);
  void notifyObserver();
}
