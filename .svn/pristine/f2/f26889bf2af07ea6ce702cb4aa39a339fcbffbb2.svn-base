package app;

import java.io.IOException;
import java.nio.file.*;
import java.util.function.Function;

public class FileWriter extends Writer {
  private final Path fileName;

  @SafeVarargs
  FileWriter(String theFileName, Function<String, String>... operation) {
    super(operation);
    fileName = Path.of(theFileName);
  }

  @Override
  protected void writeContents(String text) throws IOException {
    Files.writeString(fileName, text, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
  }
}
