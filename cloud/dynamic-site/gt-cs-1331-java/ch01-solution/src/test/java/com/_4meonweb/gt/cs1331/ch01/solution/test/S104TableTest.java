package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S104Table;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Three line text.
 *
 * @author Maxim */
class S104TableTest {

  @Test
  void testId() {
    assertEquals("1.4", new S104Table().getId(), "ID");
  }

  /** Examined table. */
  private transient Stream<String> tbl;

  @BeforeEach
  void parseAnswer() {
    tbl = new S104Table().getAnswer();
  }

  @Test
  void testRows() {
    assertEquals(5, tbl.count(), "Lines");
  }

  @Test
  void testAnswer() {
    String[] expd = {
        "a\ta^2\ta^3",
        "1\t1\t1",
        "2\t4\t8",
        "3\t9\t27",
        "4\t16\t64"
    };
    assertArrayEquals(expd, tbl.toArray(String[]::new), "Lines");
  }
}
