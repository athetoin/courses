package com._4meonweb.gt.cs1331.shell.web;

import com._4meonweb.gt.cs1331.shell.api.Solution;
import java.util.stream.Stream;

public class SolutionViewer implements SolutionViews {
  private Solution sltn;

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
  public boolean isPattern() {
    return sltn.isPattern();
  }

  @Override
  public Stream<String> getAnswer() {
    return sltn.getAnswer();
  }

}
