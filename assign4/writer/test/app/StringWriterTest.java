package app;

public class StringWriterTest extends WriterTest {
  StringWriter stringWriter = new StringWriter();

  @Override
  public Writer createWriter() {
    return stringWriter;
  }

  @Override
  String getContents() {
    return stringWriter.getContents();
  }
}
