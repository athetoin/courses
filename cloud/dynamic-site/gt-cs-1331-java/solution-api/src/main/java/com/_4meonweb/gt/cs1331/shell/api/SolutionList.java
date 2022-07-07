package com._4meonweb.gt.cs1331.shell.api;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/** Solution list.
 *
 * @author Maxim */
public class SolutionList {
  private List<Solution> solutions;

  public SolutionList(Stream<Solution> solutions) {
    this.solutions = solutions.toList();
  }

  Stream<Solution> getList() {
    return this.solutions.stream();
  }

  Optional<Solution> getSolution(String id) {
    return solutions.stream().filter(sltn -> sltn.getId() == id).findAny();
  }
}
