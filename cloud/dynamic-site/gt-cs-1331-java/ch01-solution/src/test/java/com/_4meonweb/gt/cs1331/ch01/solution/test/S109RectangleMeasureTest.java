package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S109RectangleMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Rectangle Measure test.
 *
 * @author Maxim */
class S109RectangleMeasureTest {

  @Test
  void testId() {
    assertEquals("1.9", new S109RectangleMeasure().getId(), "ID");
  }

  /** Result lines. */
  private transient String[] rslt;

  @BeforeEach
  void calculate() {
    rslt = new S109RectangleMeasure().getAnswer()
        .map(strg -> strg.split(" = ")[1])
        .toArray(String[]::new);
  }

  @Test
  void testPerimeter() {
    assertEquals("24.8", rslt[0], "Perimeter");
  }

  @Test
  void testArea() {
    assertEquals("35.55", rslt[1], "Area");
  }
}
