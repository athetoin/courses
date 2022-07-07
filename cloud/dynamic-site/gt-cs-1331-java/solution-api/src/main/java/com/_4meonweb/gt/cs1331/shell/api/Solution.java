package com._4meonweb.gt.cs1331.shell.api;

import java.util.Map;
import java.util.stream.Stream;

/** Exercise solution for publication.
 *
 * @author Maxim */
public interface Solution {
  /** Gets exercise ID.
   *
   * @return the ID */
  String getId();

  /** Gets solution title.
   *
   * @return the title */
  String getTitle();

  /** Gets solution order in list.
   *
   * @return the order number */
  int getOrder();

  /** Gets fill label in UI.
   *
   * @return the UI label */
  String getLabel();

  /** Gets flag for mono-width output.
   *
   * @return the mono-width output flag */
  boolean getPatternFlag();

  /** Gets answer.
   *
   * @return the answer */
  Stream<String> getAnswer();

  /** Sets input from String.
   *
   * @param input the input string */
  default void setInput(Stream<String> input) {
    // Default solution does not use input.
  }

  /** Gets labels for identifying input.
   *
   * @return the input stream label */
  default Stream<Map.Entry<String, String>> getInputLabel() {
    return Stream.empty();
  }

  /** Solution item in selection list.
   *
   * @author Maxim */
  public interface SolutionItem {
    String getId();

    int getOrder();

    String getLabel();
  }

  SolutionItem getItem();

  /** Solution answer for client.
   *
   * @author Maxim */
  public interface SolutionAnswer {
    String getLabel();

    boolean isPattern();

    Stream<String> getAnswers();

    Stream<Map.Entry<String, String>> getInputLabels();
  }

  SolutionAnswer getOutputAnswer();
}
