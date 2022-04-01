package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S107Approximator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Approximator test.
 *
 * @author Maxim */
class S107ApproximatorTest {

  @Test
  void testId() {
    assertEquals("1.7", new S107Approximator().getId(), "ID");
  }

  /** Result lines. */
  private transient String[] rslt;

  @BeforeEach
  void calculate() {
    rslt = new S107Approximator().getAnswer()
        .map(strg -> strg.split(" = ")[1])
        .toArray(String[]::new);
  }

  @Test
  void testResult1() {
    assertEquals("2.976046", rslt[0], "Result 1");
  }

  @Test
  void testResult2() {
    assertEquals("3.283738", rslt[1], "Result 2");
  }
}
