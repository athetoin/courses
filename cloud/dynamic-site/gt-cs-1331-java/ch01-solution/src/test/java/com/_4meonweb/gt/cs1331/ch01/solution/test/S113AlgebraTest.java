package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S113Algebra;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Algebra test.
 *
 * @author Maxim */
class S113AlgebraTest {

  @Test
  void testId() {
    assertEquals("1.13", new S113Algebra().getId(), "ID");
  }

  /** Answer lines. */
  private transient String[] lines;

  @BeforeEach
  void getSolution() {
    lines = new S113Algebra().getAnswer().toArray(String[]::new);
  }

  @Test
  void testX() {
    assertEquals("2.623901", lines[0].split(" ")[2], "X");
  }

  @Test
  void testY() {
    assertEquals("0.708740", lines[1].split(" ")[2], "Y");
  }
}
