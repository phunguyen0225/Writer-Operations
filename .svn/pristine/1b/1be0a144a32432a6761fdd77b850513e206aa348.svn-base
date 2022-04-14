package app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class OperationTest  {
  abstract StringWriter createStringWriter();
  abstract FileWriter createFileWriter();

  abstract String convert(String text);

  abstract String inputTransform1();
  abstract String outputTransform1();

  abstract String inputTransform2();
  abstract String outputTransform2();

  abstract String inputTransform3();
  abstract String outputTransform3();

  abstract String inputWriteClose();
  abstract String outputWriteClose();

  abstract String inputWriteCloseWrite1();
  abstract String inputWriteCloseWrite2();
  abstract String outputWriteCloseWrite();

  @Test
  void transform1() {
    assertEquals(outputTransform1(), convert(inputTransform1()));
  }

  @Test
  void transform2() {
    assertEquals(outputTransform2(), convert(inputTransform2()));
  }

  @Test
  void transform3() {
    assertEquals(outputTransform3(), convert(inputTransform3()));
  }

  @Test
  void StringwriteheLLoAndClose() throws IOException {
    StringWriter writer = createStringWriter();

    writer.write(inputWriteClose());
    writer.close();

    assertEquals(outputWriteClose(), writer.getContents());
  }

  @Test
  void StringwritehiclosewritethEre() throws IOException {
    StringWriter writer = createStringWriter();

    writer.write(inputWriteCloseWrite1());
    writer.close();
    writer.write(inputWriteCloseWrite2());

    assertEquals(outputWriteCloseWrite(), writer.getContents());
  }

  @Test
  void FilewriteheLLoAndClose() throws IOException {
    FileWriter writer = createFileWriter();

    writer.write(inputWriteClose());
    writer.close();

    assertEquals(outputWriteClose(), Files.readString(Path.of("myfile.txt")));
  }

  @Test
  void FilewritehiclosewritethEre() throws IOException {
    FileWriter writer = createFileWriter();

    writer.write(inputWriteCloseWrite1());
    writer.close();
    writer.write(inputWriteCloseWrite2());

    assertEquals(outputWriteCloseWrite(), Files.readString(Path.of("myfile.txt")));
  }

  @AfterEach
  public void deleteFileCreatedInTests() throws IOException {
    Files.deleteIfExists(Path.of("myfile.txt"));
  }
}
