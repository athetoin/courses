package com._4meonweb.gt.cs1331.shell.web;

import com._4meonweb.gt.cs1331.shell.api.Solution;
import java.util.stream.Stream;

/** SolutionViewer implementation.
 *
 * @author Maxim */
public class SolutionViewer implements SolutionViews {

  /** Solution. */
  private final transient Solution sltn;

  SolutionViewer(Solution solution) {
    this.sltn = solution;
  }

  @Override
  public String getId() {
    return sltn.getId();
  }

  @Override
  public String getTitle() {
    return sltn.getTitle();
  }

  @Override
  public int getOrder() {
    return sltn.getOrder();
  }

  @Override
  public String getLabel() {
    return sltn.getLabel();
  }

  @Override
  public boolean getPatternFlag() {
    return sltn.getPatternFlag();
  }

  @Override
  public Stream<String> getAnswer() {
    return sltn.getAnswer();
  }

}
