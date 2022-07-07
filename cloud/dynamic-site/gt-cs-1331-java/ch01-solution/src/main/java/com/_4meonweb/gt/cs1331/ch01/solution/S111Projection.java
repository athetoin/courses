package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** Average Speed value.
 *
 * @author Maxim */
public class S111Projection extends AbstractSolution {

  /** Creates Projection. */
  public S111Projection() {
    super("1.11", "Projection");
  }

  @Override
  public Stream<String> getAnswer() {
    long crntPpln = 312032486;
    int crntYear = 2021;
    double secYear = 365 * 24 * 60 * 60;
    double bornYear = secYear / 7;
    double deathYear = secYear / 13;
    double immgrYear = secYear / 45;
    long dltYear = Math.round(bornYear - deathYear + immgrYear);

    return IntStream.rangeClosed(1, 5)
          .mapToObj(i -> String.format(
                "In %d population is %d",
                crntYear + i,
                crntPpln + dltYear * i));
  }
}
