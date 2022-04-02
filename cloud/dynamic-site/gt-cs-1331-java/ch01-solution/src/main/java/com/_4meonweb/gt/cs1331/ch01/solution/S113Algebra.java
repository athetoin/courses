package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.Stream;

/** Cramer's rule to solve the system of linear equation.
 *
 * @author Maxim */
public class S113Algebra extends AbstractSolution {

  /** Creates Algebra. */
  public S113Algebra() {
    super("1.13", "Algebra");
  }

  @Override
  public Stream<String> getAnswer() {
    var a = 3.4;
    var b = 50.2;
    var e = 44.5;
    var c = 2.1;
    var d = .55;
    var f = 5.9;
    var x = (e * d - b * f) / (a * d - b * c);
    var y = (a * f - e * c) / (a * d - b * c);
    return Stream.of(
        "x = " + String.format("%f", x), "y = " + String.format("%f", y));
  }
}
