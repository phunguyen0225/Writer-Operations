package app;

public class StupidRemoverTest extends OperationTest {
  @Override
  StringWriter createStringWriter() {
    return new StringWriter(StupidRemoverOperation::convert);
  }

  @Override
  FileWriter createFileWriter() {
    return new FileWriter("myfile.txt", StupidRemoverOperation::convert);
  }

  @Override
  String convert(String text) {
    return StupidRemoverOperation.convert(text);
  }

  @Override
  String inputTransform1() {
    return "STUPID";
  }

  @Override
  String outputTransform1() {
    return "STUPID";
  }

  @Override
  String inputTransform2() {
    return "stupid";
  }

  @Override
  String outputTransform2() {
    return "s*****";
  }

  @Override
  String inputTransform3() {
    return "stUpid";
  }

  @Override
  String outputTransform3() {
    return "stUpid";
  }

  @Override
  String inputWriteClose() {
    return "This is really really stupid!!!";
  }

  @Override
  String outputWriteClose() {
    return "This is really really s*****!!!";
  }

  @Override
  String inputWriteCloseWrite1() {
    return "This is really really stupid";
  }

  @Override
  String inputWriteCloseWrite2() {
    return "!!!";
  }

  @Override
  String outputWriteCloseWrite() {
    return "This is really really s*****";
  }
}