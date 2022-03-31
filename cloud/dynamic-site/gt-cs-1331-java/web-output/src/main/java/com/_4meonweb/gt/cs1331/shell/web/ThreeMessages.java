package com._4meonweb.gt.cs1331.shell.web;

/** Write a program that displays Welcome to Java, Welcome to Computer Science,
 * and Programming is fun.
 *
 * @author Maxim */
public class ThreeMessages extends AbstractSolution {
  /** Create ThreeMessages. */
  public ThreeMessages() {
    super("1.1", "Three Messages", 101);
  }

  @Override
  public String getAnswer() {
    return String.format("%s%n%s%n%s",
        "Welcome to Java",
        "Welcome to Computer Science",
        "Programming is fun");
  }
}
