package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S110AverageSpeed;
import org.junit.jupiter.api.Test;

/** Average speed value test.
 *
 * @author Maxim */
class S110AverageSpeedTest {

  @Test
  void testId() {
    assertEquals("1.10", new S110AverageSpeed().getId(), "ID");
  }

  @Test
  void testSpeed() {
    assertEquals("11.538462",
          new S110AverageSpeed().getAnswer().toArray(String[]::new)[0]
                .split(" ")[3],
          "Speed");
  }
}
