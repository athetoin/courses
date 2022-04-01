package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S101ThreeMessages;
import org.junit.jupiter.api.Test;

/** Three line text.
 *
 * @author Maxim */
class S101ThreeMessagesTest {
  @Test
  void testId() {
    assertEquals("1.1", new S101ThreeMessages().getId(), "ID");
  }

  @Test
  void testAnswer() {
    String[] lines = new S101ThreeMessages().getAnswer().toArray(new String[0]);
    String[] expd = { "Welcome to Java", "Welcome to Computer Science",
        "Programming is fun" };
    assertArrayEquals(expd, lines, "Lines");
  }
}
