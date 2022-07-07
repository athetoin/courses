package com._4meonweb.gt.cs1331.shell.api;

import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

/** Abstract Solution with required input.
 *
 * @author Maxim */
public abstract class AbstractSolutionWithInput extends AbstractSolution {
  protected AbstractSolutionWithInput(String id, String title) {
    super(id, title);
  }

  /** Input Scanners. */
  private transient Scanner[] input = new Scanner[0];

  @Override
  public void setInput(Stream<String> input) {
    this.input = input.limit(getInputLabel().count())
          .map(str -> new Scanner(new ByteArrayInputStream(str.getBytes())))
          .toArray(Scanner[]::new);
  }

  /** Input stream label is required for this type of solution. */
  @Override
  public abstract Stream<Map.Entry<String, String>> getInputLabel();

  /** Gets input scanner.
   *
   * @param index the Scanner index
   * @return the Scanner */
  protected Optional<Scanner> getInput(int index) {
    return Optional.of(index).filter(i -> i >= 0 && i < input.length).stream()
          .map(i -> input[i]).findAny();
  }
}
