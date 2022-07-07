package com._4meonweb.gt.cs1331.shell.api;

import java.util.Map.Entry;
import java.util.stream.Stream;

/** Common implementation for Solution.
 *
 * @author Maxim */
public abstract class AbstractSolution implements Solution {

  /** Solution ID. */
  private final String id;

  /** Solution title. */
  private final String title;

  /** Solution order number. */
  private transient int order;

  /** Solution UI label. */
  private transient String label;

  /** Solution mono-width output flag. */
  private final boolean patternFlag;

  /** Constructor with ID, title and mono-width output flag.
   *
   * @param id the solution ID
   * @param title the solution title */
  protected AbstractSolution(String id, String title) {
    this.id = id;
    this.title = title;
    this.patternFlag = false;
  }

  /** Constructor with ID, title and mono-width output flag.
   *
   * @param id the solution ID
   * @param title the solution title
   * @param isPattern the solution output mono-width flag */
  protected AbstractSolution(String id, String title, boolean isPattern) {
    this.id = id;
    this.title = title;
    this.patternFlag = isPattern;
  }

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public SolutionItem getItem() {
    return new SolutionItemUse(this);
  }

  class SolutionItemUse implements SolutionItem {
    private Solution parent;

    public SolutionItemUse(Solution parent) {
      this.parent = parent;
    }

    @Override
    public String getId() {
      return parent.getId();
    }

    @Override
    public int getOrder() {
      return parent.getOrder();
    }

    @Override
    public String getLabel() {
      return parent.getLabel();
    }

  }

  @Override
  public SolutionAnswer getOutputAnswer() {
    return new SolutionAnswerUse(this);
  }

  class SolutionAnswerUse implements SolutionAnswer {

    private Solution parent;

    public SolutionAnswerUse(Solution parent) {
      this.parent = parent;
    }

    @Override
    public String getLabel() {
      return this.parent.getLabel();
    }

    @Override
    public boolean isPattern() {
      return this.parent.getPatternFlag();
    }

    @Override
    public Stream<String> getAnswers() {
      return this.parent.getAnswer();
    }

    @Override
    public Stream<Entry<String, String>> getInputLabels() {
      return this.parent.getInputLabel();
    }

  }

  @Override
  public String getLabel() {
    if (this.label == null) {
      this.label = this.id + ": " + this.title;
    }
    return label;
  }

  @Override
  public String getTitle() {
    return this.title;
  }

  @Override
  public boolean getPatternFlag() {
    return this.patternFlag;
  }

  @Override
  public int getOrder() {
    if (this.order == 0) {
      var parts = this.id.split("\\.");
      this.order = Integer.parseInt(parts[0], 10) * 100
            + Integer.parseInt(parts[1], 10);
    }
    return this.order;
  }
}
