package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S102FiveMessages;
import org.junit.jupiter.api.Test;

/** Three line text.
 *
 * @author Maxim */
class S102FiveMessagesTest {
  @Test
  void testId() {
    assertEquals("1.2", new S102FiveMessages().getId(), "ID");
  }

  /** Expected output. */
  private static String WLCM = "Welcome to Java";

  @Test
  void testAnswer() {
    String[] lines = new S102FiveMessages().getAnswer().toArray(String[]::new);
    String[] expd = {
        WLCM,
        WLCM,
        WLCM,
        WLCM,
        WLCM };
    assertArrayEquals(expd, lines, "Lines");
  }
}
