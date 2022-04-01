package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S103Pattern;
import org.junit.jupiter.api.Test;

/** Three line text.
 *
 * @author Maxim */
class S103PatternTest {
  @Test
  void testId() {
    assertEquals("1.3", new S103Pattern().getId(), "ID");
  }

  @Test
  void testAnswer() {
    String[] lines = new S103Pattern().getAnswer().toArray(String[]::new);
    String[] expd = {
        "    J    A    V     V    A",
        "    J   A A    V   V    A A",
        "J   J  AAAAA    V V    AAAAA",
        " J J  A     A    V    A     A" };
    assertArrayEquals(expd, lines, "Lines");
  }
}
