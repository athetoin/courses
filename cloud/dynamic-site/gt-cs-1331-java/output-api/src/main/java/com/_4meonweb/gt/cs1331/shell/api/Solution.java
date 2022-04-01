package com._4meonweb.gt.cs1331.shell.api;

import java.util.List;
import java.util.stream.Stream;

/** Exercise solution for publication.
 *
 * @author Maxim */
public interface Solution {
  /** Gets exercise ID.
   *
   * @return the ID */
  String getId();

  String getTitle();

  int getOrder();

  String getLabel();

  boolean isPattern();

  /** Gets answer.
   *
   * @return the answer */
  List<String> getAnswer();

  /** Sets input from String.
   *
   * @param input the input string */
  default void setInput(Stream<String> input) {
    // Default solution does not use input.
  }

  /** Gets labels for identifying input.
   *
   * @return the input stream label */
  default Stream<String> getInputLabel() {
    return Stream.empty();
  }
}
