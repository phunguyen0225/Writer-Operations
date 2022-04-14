package app;

public class DuplicateRemoverTest extends OperationTest {
  @Override
  StringWriter createStringWriter() {
    return new StringWriter(DuplicateRemoverOperation::convert);
  }

  @Override
  FileWriter createFileWriter() {
    return new FileWriter("myfile.txt", DuplicateRemoverOperation::convert);
  }

  @Override
  String convert(String text) {
    return DuplicateRemoverOperation.convert(text);
  }

  @Override
  String inputTransform1() {
    return "This is is it";
  }

  @Override
  String outputTransform1() {
    return "This is it";
  }

  @Override
  String inputTransform2() {
    return "THIS IS IS IT";
  }

  @Override
  String outputTransform2() {
    return "THIS IS IT";
  }

  @Override
  String inputTransform3() {
    return "This is very really very cool";
  }

  @Override
  String outputTransform3() {
    return "This is very really very cool";
  }

  @Override
  String inputWriteClose() {
    return "This is really really stupid!!!";
  }

  @Override
  String outputWriteClose() {
    return "This is really stupid!!!";
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
    return "This is really stupid";
  }
}
