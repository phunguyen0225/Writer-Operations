package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpeedTest {
  public long timeCalculation(Fibonacci fibonacci) {
    long start = System.nanoTime();

    fibonacci.fibonacciAtPosition(30);

    long end = System.nanoTime();

    return end - start;
  }

  @Test
  public void compareSimpleAndMemoizedRecursion() {
    assertTrue(timeCalculation(new FibonacciSimpleRecursion()) > timeCalculation(new FibonacciMemoizedRecursion()) * 10);
  }
}
