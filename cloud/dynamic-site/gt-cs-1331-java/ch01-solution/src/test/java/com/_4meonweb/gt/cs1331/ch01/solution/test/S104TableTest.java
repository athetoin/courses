package com._4meonweb.gt.cs1331.ch01.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com._4meonweb.gt.cs1331.ch01.solution.S104Table;
import java.util.Arrays;
import java.util.stream.Collectors;
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
    tbl = Arrays.stream(new S104Table().getAnswer().toArray(String[]::new));
  }

  @Test
  void testRows() {
    assertEquals(5, tbl.count(), "Lines");
  }

  @Test
  void testColumns() {
    assertEquals(3, tbl
        .map(ln -> ln.split("\\s+").length)
        .collect(Collectors.averagingDouble(Integer::doubleValue)),
        "3 columns");
  }
}
