package app;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

public abstract class Writer {
  private boolean open = true;
  private final Function<String, String> operation;

  @SafeVarargs
  Writer(Function<String, String>... theOperations) {
    operation = Arrays.stream(theOperations).reduce(Function.identity(), Function::andThen);
  }

  void write(String text) throws IOException {
    if (open) {
      writeContents(operation.apply(text));
    }
  }

  abstract protected void writeContents(String text) throws IOException;

  void close() {
    open = false;
  }
}