package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S108CircleMeasure;
import org.junit.jupiter.api.Test;

/** Circle Measure test.
 *
 * @author Maxim */
class S108CircleMeasureTest {

  @Test
  void testId() {
    assertEquals("1.8", new S108CircleMeasure().getId(), "ID");
  }

  @Test
  void testAnswer() {
    assertArrayEquals(
          new String[] {
              "perimeter = 34.557519",
              "area = 95.033178",
          },
          new S108CircleMeasure().getAnswer().toArray(String[]::new),
          "Result");
  }
}
