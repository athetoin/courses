package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.function.DoubleFunction;
import java.util.stream.Stream;

/** Displays the area and perimeter of a circle that has a radius of 5.5.
 *
 * @author Maxim */
public class S109RectangleMeasure extends AbstractSolution {

  /** Creates Rectangle measure. */
  public S109RectangleMeasure() {
    super("1.9", "Rectangle measure");
  }

  @Override
  public Stream<String> getAnswer() {
    var wdth = 4.5;
    var lnth = 7.9;
    DoubleFunction<String> proc = d -> String.format("%f", d)
        .replaceFirst("(?!^)0+$", "");
    var prmr = proc.apply((wdth + lnth) * 2);
    var area = proc.apply(wdth * lnth);
    return Stream.of(
        "perimeter = " + prmr,
        "area = " + area);
  }
}
