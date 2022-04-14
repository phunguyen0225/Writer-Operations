package app;

public class UpperCaseTest extends OperationTest{
  @Override
  StringWriter createStringWriter() {
    return new StringWriter(UpperCaseOperation::convert);
  }

  @Override
  FileWriter createFileWriter() {
    return new FileWriter("myfile.txt", UpperCaseOperation::convert);
  }

  @Override
  String convert(String text) {
    return UpperCaseOperation.convert(text);
  }

  @Override
  String inputTransform1() {
    return "HELLO";
  }

  @Override
  String outputTransform1() {
    return "HELLO";
  }

  @Override
  String inputTransform2() {
    return "Hello";
  }

  @Override
  String outputTransform2() {
    return "HELLO";
  }

  @Override
  String inputTransform3() {
    return "HeL1o";
  }

  @Override
  String outputTransform3() {
    return "HEL1O";
  }

  @Override
  String inputWriteClose() {
    return "heLLo";
  }

  @Override
  String outputWriteClose() {
    return "HELLO";
  }

  @Override
  String inputWriteCloseWrite1() {
    return "hi";
  }

  @Override
  String inputWriteCloseWrite2() {
    return "thEre";
  }

  @Override
  String outputWriteCloseWrite() {
    return "HI";
  }
}
