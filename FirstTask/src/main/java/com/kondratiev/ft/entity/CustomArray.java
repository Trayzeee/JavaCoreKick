package com.kondratiev.ft.entity;

import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.observer.CustomArrayObservable;
import com.kondratiev.ft.observer.CustomArrayObserver;

import java.util.Arrays;

public class CustomArray implements CustomArrayObservable {
  private long arrayId;
  private int[] data;
  private CustomArrayObserver observer;

  public CustomArray(long arrayId, int[] data) throws CustomException {
    if (data == null) {
      throw new CustomException("Data is empty!");
    }

    this.arrayId = arrayId;
    this.data = Arrays.copyOf(data, data.length);
  }

  public int[] getData() {
    return Arrays.copyOf(data, data.length);
  }

  public void setData(int[] data) {
    this.data = Arrays.copyOf(data, data.length);
  }

  public long getArrayId() {
    return arrayId;
  }

  public void setArrayId(long arrayId) {
    this.arrayId = arrayId;
  }

  public int getLength() {
    return data.length;
  }

  @Override
  public void addObserver(CustomArrayObserver observer) {
    this.observer = observer;
  }

  @Override
  public void removeObserver(CustomArrayObserver observer) {
    this.observer = null;
  }

  @Override
  public void notifyObserver() {
    observer.updateArray(this);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    CustomArray that = (CustomArray) o;
    return arrayId == that.arrayId && Arrays.equals(data, that.data);
  }

  @Override
  public int hashCode() {
    int result = Long.hashCode(arrayId);
    result = 31 * result + Arrays.hashCode(data);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("CustomArray{");
    sb.append("data=").append(Arrays.toString(data));
    sb.append(", arrayId=").append(arrayId);
    sb.append('}');
    return sb.toString();
  }
}
