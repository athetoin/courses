package com._4meonweb.gt.cs1331.shell.web;

public abstract class AbstractSolution implements Solution {
  private String id;
  private String label;
  private int order;

  AbstractSolution(String id, String label, int order) {
    this.setId(id);
    this.setLabel(label);
    this.setOrder(order);
  }

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public int getOrder() {
    return order;
  }

  @Override
  public void setOrder(int order) {
    this.order = order;
  }
}
