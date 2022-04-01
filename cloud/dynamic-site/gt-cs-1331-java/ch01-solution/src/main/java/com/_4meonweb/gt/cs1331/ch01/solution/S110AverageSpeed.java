package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.Stream;

/** Average Speed value.
 *
 * @author Maxim */
public class S110AverageSpeed extends AbstractSolution {
  public S110AverageSpeed() {
    super("1.10", "Average Speed");
  }

  @Override
  public Stream<String> getAnswer() {
    return Stream.of(String.format("%s%f%s",
        "Average speed is ",
        14.0 / 1.6 / (45.0 / 60.0 + 30.0 / 60.0 / 60.0),
        " km/h"));
  }
}
