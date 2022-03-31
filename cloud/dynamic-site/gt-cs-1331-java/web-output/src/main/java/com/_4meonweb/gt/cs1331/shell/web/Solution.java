package com._4meonweb.gt.cs1331.shell.web;

import java.util.stream.Stream;

/** Exercise solution for publication.
 *
 * @author Maxim */
public interface Solution {
  /** Gets exercise ID.
   *
   * @return the ID */
  String getId();

  void setId(String id);

  String getLabel();

  void setLabel(String label);

  int getOrder();

  public void setOrder(int order);

  /** Gets answer.
   *
   * @return the answer */
  String getAnswer();

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
