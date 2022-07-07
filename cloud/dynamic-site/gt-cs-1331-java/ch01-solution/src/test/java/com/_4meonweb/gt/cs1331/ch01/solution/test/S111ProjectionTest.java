package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
  void testAnswer() {
    final var rslt = new S111Projection().getAnswer()
          .toArray(String[]::new);
    final String[] expd = {
        "In 2022 population is 314812583",
        "In 2023 population is 317592680",
        "In 2024 population is 320372777",
        "In 2025 population is 323152874",
        "In 2026 population is 325932971",
    };
    assertArrayEquals(expd, rslt, "Output");
  }
}
