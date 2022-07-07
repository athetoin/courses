package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S106Summator;
import org.junit.jupiter.api.Test;

/** Summator test.
 *
 * @author Maxim */
class S106SummatorTest {

  @Test
  void testId() {
    assertEquals("1.6", new S106Summator().getId(), "ID");
  }

  @Test
  void testAnswer() {
    final var rslt = new S106Summator().getAnswer().toArray(String[]::new);
    final String[] expd = { "1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45" };
    assertArrayEquals(expd, rslt, "Sum");
  }
}
