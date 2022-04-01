package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S108CircleMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Circle Measure test.
 *
 * @author Maxim */
class S108CircleMeasureTest {

  @Test
  void testId() {
    assertEquals("1.8", new S108CircleMeasure().getId(), "ID");
  }

  /** Result lines. */
  private transient String[] rslt;

  @BeforeEach
  void calculate() {
    rslt = (new S108CircleMeasure())
        .getAnswer()
        .map(strg -> strg.split(" = ")[1])
        .toArray(String[]::new);
  }

  @Test
  void testPerimeter() {
    assertEquals("34.557519", rslt[0], "Perimeter");
  }

  @Test
  void testArea() {
    assertEquals("95.033178", rslt[1], "Area");
  }
}
