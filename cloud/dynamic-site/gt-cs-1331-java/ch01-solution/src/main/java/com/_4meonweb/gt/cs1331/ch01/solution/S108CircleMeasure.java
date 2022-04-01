package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.Stream;

/** Displays the area and perimeter of a circle that has a radius of 5.5.
 *
 * @author Maxim */
public class S108CircleMeasure extends AbstractSolution {
  public S108CircleMeasure() {
    super("1.8", "Circle measure");
  }

  @Override
  public Stream<String> getAnswer() {
    var rds = 5.5;
    var prmr = 2 * rds * Math.PI;
    var area = rds * rds * Math.PI;
    return Stream.of(
        "perimeter = " + String.format("%f", prmr),
        "area = " + String.format("%f", area));
  }
}
