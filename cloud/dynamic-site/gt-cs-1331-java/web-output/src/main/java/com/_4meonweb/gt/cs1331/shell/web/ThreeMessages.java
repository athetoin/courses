package com._4meonweb.gt.cs1331.shell.web;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Write a program that displays Welcome to Java, Welcome to Computer Science,
 * and Programming is fun.
 *
 * @author Maxim */
public class ThreeMessages extends AbstractSolution {
  /** Create ThreeMessages. */
  public ThreeMessages() {
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
