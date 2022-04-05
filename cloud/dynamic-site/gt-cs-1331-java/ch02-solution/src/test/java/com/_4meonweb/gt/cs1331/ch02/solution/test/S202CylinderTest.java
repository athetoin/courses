package com._4meonweb.gt.cs1331.ch02.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch02.solution.S202Cylinder;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

/** Rectangle Measure test.
 *
 * @author Maxim */
class S202CylinderTest {

  /** Tested object. */
  transient S202Cylinder clnr = new S202Cylinder();

  @Test
  void testId() {
    assertEquals("2.2", clnr.getId(), "ID");
  }

  @Test
  void testInputLabel() {
    assertArrayEquals(new String[] { "a radius and a length of a cylinder" },
          clnr.getInputLabel().toArray(),
          "InputLabel");
  }

  @Test
  void testAnswer() {
    clnr.setInput(Stream.of("5.50 12.00 sdfth"));
    assertArrayEquals(Stream.of(
          "For cylinder with radius 5.5 and length 12",
          "The area is 95.0332",
          "The volume is 1140.3984").toArray(String[]::new),
          clnr.getAnswer().toArray(String[]::new),
          "Result");
  }
}
