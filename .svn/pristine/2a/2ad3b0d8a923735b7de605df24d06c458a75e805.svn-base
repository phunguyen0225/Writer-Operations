package app;

import org.junit.jupiter.api.AfterEach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterTest extends WriterTest {
  @Override
  public Writer createWriter() {
    return new FileWriter("myfile.txt");
  }

  @Override
  String getContents() throws IOException {
    return Files.readString(Path.of("myfile.txt"));
  }

  @AfterEach
  public void deleteFileCreatedInTests() throws IOException {
    Files.deleteIfExists(Path.of("myfile.txt"));
  }
}
