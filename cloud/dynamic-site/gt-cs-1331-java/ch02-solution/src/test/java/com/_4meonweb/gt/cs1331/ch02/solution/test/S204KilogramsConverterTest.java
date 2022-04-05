package com._4meonweb.gt.cs1331.ch02.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch02.solution.S204KilogramConverter;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

/** Rectangle Measure test.
 *
 * @author Maxim */
class S204KilogramsConverterTest {

  /** Tested object. */
  transient S204KilogramConverter clnr = new S204KilogramConverter();

  @Test
  void testId() {
    assertEquals("2.4", clnr.getId(), "ID");
  }

  @Test
  void testInputLabel() {
    assertArrayEquals(new String[] { "a number in pounds" },
          clnr.getInputLabel().toArray(),
          "InputLabel");
  }

  @Test
  void testAnswer() {
    clnr.setInput(Stream.of("55.500 sdfth"));
    assertEquals("55.5 pounds is 25.197 kilograms",
          clnr.getAnswer().toArray(String[]::new)[0],
          "Result");
  }
}
