package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.Stream;

/** Average Speed value in kilometer.
 *
 * @author Maxim */
public class S112SpeedCalc extends AbstractSolution {

  /** Creates Speed Calculator. */
  public S112SpeedCalc() {
    super("1.12", "Speed Calculator");
  }

  @Override
  public Stream<String> getAnswer() {
    return Stream.of(String.format("%f%s",
        24 / 1.6 / (1 + 40.0 / 60 + 35.0 / 60 / 60),
        " kilometers per hour"));
  }
}
