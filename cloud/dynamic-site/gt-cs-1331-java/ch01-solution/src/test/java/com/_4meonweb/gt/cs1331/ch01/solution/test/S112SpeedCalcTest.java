package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S112SpeedCalc;
import org.junit.jupiter.api.Test;

/** Speed calculator test.
 *
 * @author Maxim */
class S112SpeedCalcTest {

  @Test
  void testId() {
    assertEquals("1.12", new S112SpeedCalc().getId(), "ID");
  }

  @Test
  void testSpeed() {
    assertEquals("8.947804",
          new S112SpeedCalc().getAnswer().toArray(String[]::new)[0]
                .split(" ")[0],
          "Speed");
  }
}
