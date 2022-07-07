package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S107Approximator;
import org.junit.jupiter.api.Test;

/** Approximator test.
 *
 * @author Maxim */
class S107ApproximatorTest {

  @Test
  void testId() {
    assertEquals("1.7", new S107Approximator().getId(), "ID");
  }

  @Test
  void testAnswer() {
    assertArrayEquals(
          new String[] {
              "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = 2.976046",
              "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = 3.283738"
          },
          new S107Approximator().getAnswer().toArray(String[]::new),
          "Result");
  }
}
