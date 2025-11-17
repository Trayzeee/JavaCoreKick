package com.kondratiev.ft.entity;

import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.observer.CustomArrayObservable;

import java.util.Arrays;

public class CustomArray implements CustomArrayObservable {
  private long arrayId;
  private int[] data;
  private int size;
  private CustomArrayObservable observer;

  public CustomArray(long arrayId, int size, int[] data) throws CustomException {
    if (data == null) {
      throw new CustomException("Data is empty!");
    }
    if (size <= 0) {
      throw new CustomException("Size value has to be positive!");
    }
      if (size > data.length) {
        throw new CustomException("Size must be equal to array length! " + (size - data.length) + " element(s) are missing!");
      }
      if (size < data.length) {
        throw new CustomException("Size must be equal to array length! " + (data.length - size) + " element(s) are extra!");
      }
    this.arrayId = arrayId;
    this.size = size;
    this.data = Arrays.copyOf(data, size);
  }

  public int[] getData() {
    return Arrays.copyOf(data, size);
  }

  public void setData(int[] data) {
    this.data = Arrays.copyOf(data, size);
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public long getArrayId() {
    return arrayId;
  }

  public void setArrayId(long arrayId) {
    this.arrayId = arrayId;
  }

  @Override
  public void addObserver(CustomArrayObservable observer) throws CustomException {
    if (observer == null) {
      throw new CustomException("Adding null observer isn't allowed!");
    }
    this.observer = observer;
  }

  @Override
  public void removeObserver(CustomArrayObservable observer) {
    this.observer = null;
  }

  @Override
  public void notifyObserver() throws CustomException {
    if (observer == null) {
      throw new CustomException("");
    }
    observer.updateArray(this);
  }

  @Override
  public void updateArray(CustomArray array) {
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    CustomArray that = (CustomArray) o;
    return size == that.size && Arrays.equals(data, that.data);
  }

  @Override
  public int hashCode() {
    int result = Arrays.hashCode(data);
    result = 31 * result + getSize();
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ArrayExample {");
    sb.append("data = ").append(Arrays.toString(data));
    sb.append(", size = ").append(size);
    sb.append('}');
    return sb.toString();
  }

}
