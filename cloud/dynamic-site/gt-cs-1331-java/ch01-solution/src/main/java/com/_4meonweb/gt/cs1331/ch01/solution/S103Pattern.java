package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Write a program that displays the pattern of word JAVA.
 *
 * @author Maxim */
public class S103Pattern extends AbstractSolution {
  public S103Pattern() {
    super("1.3", "Pattern", true);
  }

  @Override
  public List<String> getAnswer() {
    return Stream.of(
        "    J    A    V     V    A",
        "    J   A A    V   V    A A",
        "J   J  AAAAA    V V    AAAAA",
        " J J  A     A    V    A     A")
        .collect(Collectors.toUnmodifiableList());
  }

}
