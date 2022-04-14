package app;

public interface DuplicateRemoverOperation {
  static String convert(String text) {
    return text.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
  }
}
