package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S111Projection;
import org.junit.jupiter.api.Test;

/** Population projection test.
 *
 * @author Maxim */
class S111ProjectionTest {

  @Test
  void testId() {
    assertEquals("1.11", new S111Projection().getId(), "ID");
  }

  @Test
  void testLines() {
    assertEquals(6, new S111Projection().getAnswer().count(),
        "Lines");
  }
}
