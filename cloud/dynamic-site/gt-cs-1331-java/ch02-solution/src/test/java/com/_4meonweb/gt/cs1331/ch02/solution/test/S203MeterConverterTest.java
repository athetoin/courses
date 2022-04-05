package com._4meonweb.gt.cs1331.ch02.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch02.solution.S203MeterConverter;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

/** Feet to Meters Converter test.
 *
 * @author Maxim */
class S203MeterConverterTest {

  /** Tested object. */
  transient S203MeterConverter clnr = new S203MeterConverter();

  @Test
  void testId() {
    assertEquals("2.3", clnr.getId(), "ID");
  }

  @Test
  void testInputLabel() {
    assertArrayEquals(new String[] { "a value for feet" },
          clnr.getInputLabel().toArray(),
          "InputLabel");
  }

  @Test
  void testAnswer() {
    clnr.setInput(Stream.of("16.500 sdfth"));
    assertEquals("16.5 feet is 5.0325 meters",
          clnr.getAnswer().toArray(String[]::new)[0],
          "Result");
  }
}
