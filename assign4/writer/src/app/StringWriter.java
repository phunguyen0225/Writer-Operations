package app;

import java.util.function.Function;

public class StringWriter extends Writer {
  private final StringBuilder target = new StringBuilder();

  @SafeVarargs
  StringWriter(Function<String, String>... operation) {
    super(operation);
  }

  @Override
  protected void writeContents(String text) {
    target.append(text);
  }

  public String getContents() {
    return target.toString();
  }
}
