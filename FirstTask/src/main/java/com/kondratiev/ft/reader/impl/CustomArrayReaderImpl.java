package com.kondratiev.ft.reader.impl;

import com.kondratiev.ft.exception.CustomException;
import com.kondratiev.ft.reader.CustomArrayReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CustomArrayReaderImpl implements CustomArrayReader {
  private static final Logger log = LogManager.getLogger();

  @Override
  public List<String> readFromFile(String path) throws CustomException {
    try {
      URL resource = getClass().getClassLoader().getResource(path);
      if (resource == null) {
        throw new CustomException("File not found: " + path);
      }
      Path filePath = Path.of(resource.toURI());
      List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
      log.info("File '{}' read successfully, {} lines", path, lines.size());
      return lines;
    } catch (IOException | URISyntaxException e) {
      throw new CustomException("IO problem while reading file " + path, e);
    }
  }
}
