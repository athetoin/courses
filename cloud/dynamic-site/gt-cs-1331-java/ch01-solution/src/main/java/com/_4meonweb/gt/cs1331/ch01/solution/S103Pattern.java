package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.Stream;

/** Write a program that displays the pattern of word JAVA.
 *
 * @author Maxim */
public class S103Pattern extends AbstractSolution {

  /** Create Pattern. */
  public S103Pattern() {
    super("1.3", "Pattern", true);
  }

  @Override
  public Stream<String> getAnswer() {
    return Stream.of(
        "    J    A    V     V    A",
        "    J   A A    V   V    A A",
        "J   J  AAAAA    V V    AAAAA",
        " J J  A     A    V    A     A");
  }

}
