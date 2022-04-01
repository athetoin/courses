package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S106Summator;
import org.junit.jupiter.api.Test;

/** Summator test.
 *
 * @author Maxim */
class S106SummatorTest {

  @Test
  void testId() {
    assertEquals("1.6", new S106Summator().getId(), "ID");
  }

  @Test
  void testAnswer() {
    final var rslt = new S106Summator().getAnswer().toArray(String[]::new)[0];
    assertEquals("45", rslt.substring(rslt.length() - 2), "Sum");
  }
}
