package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S105Computator;
import org.junit.jupiter.api.Test;

/** Three line text.
 *
 * @author Maxim */
class S105ComputatorTest {

  @Test
  void testId() {
    assertEquals("1.5", new S105Computator().getId(), "ID");
  }

  @Test
  void testAnswer() {
    assertArrayEquals(
          new String[] { "0.839286" },
          new S105Computator().getAnswer().toArray(String[]::new),
          "Result");
  }
}
