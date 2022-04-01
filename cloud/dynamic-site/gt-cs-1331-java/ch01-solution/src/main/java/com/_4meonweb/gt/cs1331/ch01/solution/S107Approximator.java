package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.Stream;

/** Pi can be computed using the two approximate formulas.
 *
 * @author Maxim */
public class S107Approximator extends AbstractSolution {
  public S107Approximator() {
    super("1.7", "Approximate PI");
  }

  @Override
  public Stream<String> getAnswer() {
    var rslt1 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
    var rslt2 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11
        + 1.0 / 13);
    return Stream.of(
        "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = "
            + String.format("%f", rslt1),
        "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = "
            + String.format("%f", rslt2));
  }
}
