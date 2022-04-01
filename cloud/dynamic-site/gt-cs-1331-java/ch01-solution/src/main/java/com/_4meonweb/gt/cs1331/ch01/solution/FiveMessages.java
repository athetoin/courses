package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** Write a program that displays "Welcome to Java" five times.
 *
 * @author Maxim */
public class FiveMessages extends AbstractSolution {
  /** Create FiveMessages. */
  public FiveMessages() {
    super("1.2", "Display five messages");
  }

  @Override
  public List<String> getAnswer() {
    return IntStream.range(0, 5).mapToObj(i -> "Welcome to Java")
        .collect(Collectors.toUnmodifiableList());
  }
}
