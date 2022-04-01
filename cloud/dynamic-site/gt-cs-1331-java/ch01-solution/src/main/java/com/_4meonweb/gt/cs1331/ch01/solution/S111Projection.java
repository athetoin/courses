package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** Average Speed value.
 *
 * @author Maxim */
public class S111Projection extends AbstractSolution {

  public S111Projection() {
    super("1.11", "Projection");
  }

  @Override
  public Stream<String> getAnswer() {
    var crntPpln = 312032486;
    var crntYear = 2021;
    var secYear = 365 * 24 * 60 * 60;
    var bornYear = secYear / 7;
    var deathYear = secYear / 13;
    var immgrYear = secYear / 45;
    var dltYear = bornYear - deathYear + immgrYear;

    return IntStream.rangeClosed(0, 5)
        .mapToObj(i -> String.format("%s%d%s%,d", "In ", crntYear + i,
            " population is ", crntPpln + dltYear * i));
  }
}
