package app;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombineOperationTest {
  @Test
  void StringWriterWriteThisisniceandCallLowerStupidUpper() throws IOException {
    StringWriter stringWriter = new StringWriter(LowerCaseOperation::convert, StupidRemoverOperation::convert, UpperCaseOperation::convert);

    stringWriter.write("This is nice");
    stringWriter.close();

    assertEquals("THIS IS NICE", stringWriter.getContents());
  }

  @Test
  void StringWriterwriteThisisStupidandCallLowerStupidUpper() throws IOException {
    StringWriter stringWriter = new StringWriter(LowerCaseOperation::convert, StupidRemoverOperation::convert, UpperCaseOperation::convert);

    stringWriter.write("This is STUPID");
    stringWriter.close();

    assertEquals("THIS IS S*****", stringWriter.getContents());
  }

  @Test
  void StringWriterWriteThisisniceandCallUpperStupidLower() throws IOException {
    StringWriter stringWriter = new StringWriter(UpperCaseOperation::convert, StupidRemoverOperation::convert, LowerCaseOperation::convert);

    stringWriter.write("This is nice");
    stringWriter.close();

    assertEquals("this is nice", stringWriter.getContents());
  }

  @Test
  void StringWriterwriteThisisStupidandCallUpperStupidLower() throws IOException {
    StringWriter stringWriter = new StringWriter(UpperCaseOperation::convert, StupidRemoverOperation::convert, LowerCaseOperation::convert);

    stringWriter.write("This is STUPID");
    stringWriter.close();

    assertEquals("this is stupid", stringWriter.getContents());
  }
}
