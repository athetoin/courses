package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.Stream;

/** Expression computator.
 *
 * @author Maxim */
public class S105Computator extends AbstractSolution {

  /** Create Computator. */
  public S105Computator() {
    super("1.5", "Computator");
  }

  @Override
  public Stream<String> getAnswer() {
    Double rslt = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
    return Stream.of(String.format("%f", rslt));
  }

}
