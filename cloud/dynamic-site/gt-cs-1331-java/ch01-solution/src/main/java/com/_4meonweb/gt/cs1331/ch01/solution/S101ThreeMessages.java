package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Write a program that displays Welcome to Java, Welcome to Computer Science,
 * and Programming is fun.
 *
 * @author Maxim */
public class S101ThreeMessages extends AbstractSolution {
  /** Create ThreeMessages. */
  public S101ThreeMessages() {
    super("1.1", "Display three messages");
  }

  @Override
  public List<String> getAnswer() {
    return Stream.of(
        "Welcome to Java",
        "Welcome to Computer Science",
        "Programming is fun").collect(Collectors.toUnmodifiableList());
  }
}
