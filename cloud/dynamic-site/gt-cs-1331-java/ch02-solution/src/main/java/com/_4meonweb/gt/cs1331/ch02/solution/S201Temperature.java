package com._4meonweb.gt.cs1331.ch02.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolutionWithInput;
import java.math.BigDecimal;
import java.util.stream.Stream;

/** Reads a Celsius degree then converts it to Fahrenheit.
 *
 * @author Maxim */
public class S201Temperature extends AbstractSolutionWithInput {

  public S201Temperature() {
    super("2.1", "Temperature");
  }

  @Override
  public Stream<String> getAnswer() {
    var clss = getInput(0).nextBigDecimal().stripTrailingZeros();

    var frnt = clss.multiply(BigDecimal.valueOf(9.0 / 5))
          .add(BigDecimal.valueOf(32)).stripTrailingZeros();

    return Stream.of(String.join(" ",
          clss.toPlainString(), "Celsius is",
          frnt.toPlainString(), "Fahrenheit"));
  }

  @Override
  public Stream<String> getInputLabel() {
    return Stream.of("a degree in Celsius");
  }
}
