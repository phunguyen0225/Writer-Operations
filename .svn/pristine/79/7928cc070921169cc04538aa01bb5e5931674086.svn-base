package app;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public interface FibonacciTest {

  Fibonacci createFibonacci();

  @Test
  default void canary() {
    assertTrue(true);
  }

  @Test
  default void smallValueTests() {
    Fibonacci fibonacci = createFibonacci();

    assertAll(
      () -> assertEquals(new BigInteger("1"), fibonacci.fibonacciAtPosition(0)),
      () -> assertEquals(new BigInteger("1"), fibonacci.fibonacciAtPosition(1)),
      () -> assertEquals(new BigInteger("2"), fibonacci.fibonacciAtPosition(2)),
      () -> assertEquals(new BigInteger("8"), fibonacci.fibonacciAtPosition(5)),
      () -> assertEquals(new BigInteger("89"), fibonacci.fibonacciAtPosition(10))
    );
  }

  @Test
  default void largeValueTests() {
    Fibonacci fibonacci = createFibonacci();

    assertAll(
      () -> assertEquals(new BigInteger("20365011074"), fibonacci.fibonacciAtPosition(50)),
      () -> assertEquals(new BigInteger("12200160415121876738"), fibonacci.fibonacciAtPosition(92))
    );
  }
}