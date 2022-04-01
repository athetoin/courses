package com._4meonweb.gt.cs1331.shell.api;

public abstract class AbstractSolution implements Solution {
  private String id;
  private String title;
  private int order;
  private String label;
  private boolean pattern;

  protected AbstractSolution(String id, String title) {
    this.id = id;
    this.title = title;
  }

  protected AbstractSolution(String id, String title, boolean isPattern) {
    this.id = id;
    this.title = title;
    this.pattern = isPattern;
  }

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public String getLabel() {
    if (this.label == null) {
      this.label = String.format("%s: %s", this.id, this.title);
    }
    return label;
  }

  @Override
  public String getTitle() {
    return this.title;
  }

  @Override
  public boolean isPattern() {
    return this.pattern;
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
