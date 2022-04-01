package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** Summation series.
 *
 * <pre>{@code 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9}</pre>
 *
 * @author Maxim */
public class S106Summator extends AbstractSolution {
  /** Create S106Summator. */
  public S106Summator() {
    super("1.6", "Summation series");
  }

  @Override
  public Stream<String> getAnswer() {
    final var result = IntStream.rangeClosed(1, 9)
        .sum();
    return Stream.of("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + result);
  }
}
