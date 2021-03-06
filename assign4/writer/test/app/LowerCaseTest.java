package app;

public class LowerCaseTest extends OperationTest {
  @Override
  StringWriter createStringWriter() {
    return new StringWriter(LowerCaseOperation::convert);
  }

  @Override
  FileWriter createFileWriter() {
    return new FileWriter("myfile.txt", LowerCaseOperation::convert);
  }

  @Override
  String convert(String text) {
    return LowerCaseOperation.convert(text);
  }

  @Override
  String inputTransform1() {
    return "hello";
  }

  @Override
  String outputTransform1() {
    return "hello";
  }

  @Override
  String inputTransform2() {
    return "Hello";
  }

  @Override
  String outputTransform2() {
    return "hello";
  }

  @Override
  String inputTransform3() {
    return "HeL1o";
  }

  @Override
  String outputTransform3() {
    return "hel1o";
  }

  @Override
  String inputWriteClose() {
    return "heLLo";
  }

  @Override
  String outputWriteClose() {
    return "hello";
  }

  @Override
  String inputWriteCloseWrite1() {
    return "HI";
  }

  @Override
  String inputWriteCloseWrite2() {
    return "thEre";
  }

  @Override
  String outputWriteCloseWrite() {
    return "hi";
  }
}
