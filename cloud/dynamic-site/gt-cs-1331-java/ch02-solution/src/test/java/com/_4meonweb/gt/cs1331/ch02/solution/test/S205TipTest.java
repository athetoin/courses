package com._4meonweb.gt.cs1331.ch02.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch02.solution.S205Tip;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

/** Rectangle Measure test.
 *
 * @author Maxim */
class S205TipTest {

  /** Tested object. */
  transient S205Tip tip = new S205Tip();

  @Test
  void testId() {
    assertEquals("2.5", tip.getId(), "ID");
  }

  @Test
  void testInputLabel() {
    assertArrayEquals(new String[] { "the subtotal and a gratuity rate" },
          tip.getInputLabel().toArray(),
          "InputLabel");
  }

  @Test
  void testAnswer() {
    tip.setInput(Stream.of("10.00 15 sdfth"));
    assertEquals("The gratuity is $1.50 and total is $11.50",
          tip.getAnswer().toArray(String[]::new)[0],
          "Result");
  }
}
