package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** Write a program that displays "Welcome to Java" five times.
 *
 * @author Maxim */
public class S102FiveMessages extends AbstractSolution {
  /** Create FiveMessages. */
  public S102FiveMessages() {
    super("1.2", "Display five messages");
  }

  @Override
  public Stream<String> getAnswer() {
    return IntStream.range(0, 5).mapToObj(i -> "Welcome to Java");
  }
}
