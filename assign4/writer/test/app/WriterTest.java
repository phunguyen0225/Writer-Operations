package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class WriterTest {
  private Writer writer;

  abstract Writer createWriter();

  abstract String getContents() throws IOException;

  @BeforeEach
  public void init() {
    writer = createWriter();
  }

  @Test
  void canary() {
    assertTrue(true);
  }

  @Test
  void writeHelloCallClose() throws IOException {
    writer.write("hello");
    writer.close();

    assertEquals("hello", getContents());
  }

  @Test
  void writeThereCallClose() throws IOException {
    writer.write("there");
    writer.close();

    assertEquals("there", getContents());
  }

  @Test
  void writeHelloWriteThereCallClose() throws IOException {
    writer.write("hello");
    writer.write("there");
    writer.close();

    assertEquals("hellothere", getContents());
  }

  @Test
  void writeHelloCallCloseWriteThere() throws IOException {
    writer.write("hello");
    writer.close();
    writer.write("there");

    assertEquals("hello", getContents());
  }
}
