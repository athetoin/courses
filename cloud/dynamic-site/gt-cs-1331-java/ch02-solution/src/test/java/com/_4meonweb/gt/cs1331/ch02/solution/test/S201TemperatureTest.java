package com._4meonweb.gt.cs1331.ch02.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch02.solution.S201Temperature;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

/** Rectangle Measure test.
 *
 * @author Maxim */
class S201TemperatureTest {

  /** Tested objects. */
  transient S201Temperature tmpt = new S201Temperature();

  @Test
  void testId() {
    assertEquals("2.1", tmpt.getId(), "ID");
  }

  @Test
  void testInputLabel() {
    assertArrayEquals(new String[] { "a degree in Celsius" },
          tmpt.getInputLabel()
                .toArray(),
          "InputLabel");
  }

  @Test
  void testAnswer() {
    tmpt.setInput(Stream.of("43.500e0 shdfhjysy"));
    assertEquals("43.5 Celsius is 110.3 Fahrenheit",
          tmpt.getAnswer().toArray(String[]::new)[0],
          "Result");
  }
}
