package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S109RectangleMeasure;
import org.junit.jupiter.api.Test;

/** Rectangle Measure test.
 *
 * @author Maxim */
class S109RectangleMeasureTest {

  @Test
  void testId() {
    assertEquals("1.9", new S109RectangleMeasure().getId(), "ID");
  }

  @Test
  void testAnswer() {
    final var rslt = new S109RectangleMeasure().getAnswer()
          .toArray(String[]::new);
    final String[] expd = {
        "perimeter = 24.8",
        "area = 35.55"
    };
    assertArrayEquals(expd, rslt, "Output");
  }
}
