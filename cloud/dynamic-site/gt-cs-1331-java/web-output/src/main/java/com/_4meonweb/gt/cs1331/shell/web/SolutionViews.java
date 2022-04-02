package com._4meonweb.gt.cs1331.shell.web;

import com._4meonweb.gt.cs1331.shell.api.Solution;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import java.util.stream.Collectors;

/** Solution views required for web UI.
 *
 * @author Maxim */
public interface SolutionViews extends Solution {

  /** Solution item view in common list.
   *
   * @author Maxim */
  interface SolutionItem {

    /** Gets ID.
     *
     * @return the ID */
    @XmlElement
    String getId();

    /** Gets order number in list.
     *
     * @return the order number */
    @XmlElement
    int getOrder();

    /** Gets UI label.
     *
     * @return the label */
    @XmlElement
    String getLabel();
  }

  /** Gets solution item view from Solution interface.
   *
   * @return the solution item view */
  default SolutionItem getItem() {
    return new SolutionItem() {

      @Override
      public String getId() {
        return SolutionViews.this.getId();
      }

      @Override
      public int getOrder() {
        return SolutionViews.this.getOrder();
      }

      @Override
      public String getLabel() {
        return SolutionViews.this.getLabel();
      }
    };
  }

  /** Solution answer view for output.
   *
   * @author Maxim */
  interface SolutionAnswer {

    /** Gets mono-width output flag.
     *
     * @return the flag */
    @XmlElement(name = "isPattern")
    boolean isPattern();

    /** Gets solution answer output.
     *
     * @return the answer output */
    @XmlElement
    List<String> getOutput();
  }

  /** Gets solution answer for output.
   *
   * @return the solution answer view */
  default SolutionAnswer outputAnswer() {
    return new SolutionAnswer() {

      @Override
      public boolean isPattern() {
        return SolutionViews.this.getPatternFlag();
      }

      @Override
      public List<String> getOutput() {
        return SolutionViews.this.getAnswer()
              .collect(Collectors.toUnmodifiableList());
      }

    };
  }
}
