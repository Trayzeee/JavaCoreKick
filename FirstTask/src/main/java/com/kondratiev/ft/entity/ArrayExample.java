package com.kondratiev.ft.entity;


import com.kondratiev.ft.exception.CustomException;
import java.util.Arrays;

public class ArrayExample {
  private int[] data;
  private int size;

  public ArrayExample(int size, int[] data) throws CustomException {
    if (data == null) {
      throw new CustomException("Data is empty!");
    }
    if (size <= 0) {
      throw new CustomException("Size value has to be positive!");
    }
    if (size != data.length) {
      if (size > data.length) {
        throw new CustomException("Size must be equal to array length! " + (size - data.length) + " element(s) are missing!");
      }
      else {
        throw new CustomException("Size must be equal to array length! " + (data.length - size) + " element(s) are extra!");
      }
    }
    this.size = size;
    this.data = Arrays.copyOf(data, data.length);
  }

  public int[] getData() {
    return data;
  }

  public void setData(int[] data) {
    this.data = data;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    ArrayExample that = (ArrayExample) o;
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
