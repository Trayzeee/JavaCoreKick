package com.kondratiev.ft.parser.impl;

import com.kondratiev.ft.parser.CustomArrayParser;
import com.kondratiev.ft.validator.impl.CustomArrayValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayParserImpl implements CustomArrayParser {
  private static final Logger log = LogManager.getLogger();

  @Override
  public int[] parseToArray(List<String> linesFromFile) {
    CustomArrayValidatorImpl validator = new CustomArrayValidatorImpl();
    List<Integer> buffer = new ArrayList<>();

    for (String line : linesFromFile) {
      if (line == null) {
        continue;
      }
      String stripped = line.strip();
      if (!validator.isLineValid(stripped)) {
        log.warn("Skipped invalid line: {}", line);
        continue;
      }

      String[] tokens = stripped.split(DATA_SPLIT_REGEX);
      for (String t : tokens) {
        if (t.isEmpty()) {
          continue;
        }
        buffer.add(Integer.parseInt(t));
      }
    }

    int[] result = new int[buffer.size()];
    for (int i = 0; i < buffer.size(); i++) {
      result[i] = buffer.get(i);
    }
    log.info("Parser finished: {} numbers", result.length);
    return result;
  }
}