package com._4meonweb.gt.cs1331.shell.api;

import jakarta.xml.bind.annotation.XmlElement;
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

  interface SolutionItem {
    @XmlElement
    String getId();

    @XmlElement
    int getOrder();

    @XmlElement
    String getLabel();
  }

  default SolutionItem getItem() {
    return new SolutionItem() {

      @Override
      public String getId() {
        return Solution.this.getId();
      }

      @Override
      public int getOrder() {
        return Solution.this.getOrder();
      }

      @Override
      public String getLabel() {
        return Solution.this.getLabel();
      }
    };
  }

  interface SolutionAnswer {
    @XmlElement
    boolean isPattern();

    @XmlElement
    List<String> getOutput();
  }

  default SolutionAnswer outputAnswer() {
    return new SolutionAnswer() {

      @Override
      public boolean isPattern() {
        return Solution.this.isPattern();
      }

      @Override
      public List<String> getOutput() {
        return Solution.this.getAnswer();
      }

    };
  }
}
