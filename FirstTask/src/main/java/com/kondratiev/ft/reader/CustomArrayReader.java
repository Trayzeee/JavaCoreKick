package com.kondratiev.ft.reader;

import com.kondratiev.ft.exception.CustomException;
import java.util.List;

public interface CustomArrayReader {
    List<String> readFromFile(String filename) throws CustomException;
}
