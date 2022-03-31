package com._4meonweb.gt.cs1331.shell.web;

/** Write a program that displays "Welcome to Java" five times.
 *
 * @author Maxim */
public class FiveMessages extends AbstractSolution {
  /** Create FiveMessages. */
  public FiveMessages() {
    super("1.2", "Five Messages", 102);
  }

  @Override
  public String getAnswer() {
    return String.format("%s%n", "Welcome to Java")
        .repeat(5).trim();
  }
}
