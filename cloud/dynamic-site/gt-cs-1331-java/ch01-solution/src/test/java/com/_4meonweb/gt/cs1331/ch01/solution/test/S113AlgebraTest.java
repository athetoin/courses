package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S113Algebra;
import org.junit.jupiter.api.Test;

/** Algebra test.
 *
 * @author Maxim */
class S113AlgebraTest {

  @Test
  void testId() {
    assertEquals("1.13", new S113Algebra().getId(), "ID");
  }

  @Test
  void testAnswer() {
    final var rslt = new S113Algebra().getAnswer()
          .toArray(String[]::new);
    final String[] expd = {
        "x = 2.623901",
        "y = 0.70874",
    };
    assertArrayEquals(expd, rslt, "Output");
  }
}
