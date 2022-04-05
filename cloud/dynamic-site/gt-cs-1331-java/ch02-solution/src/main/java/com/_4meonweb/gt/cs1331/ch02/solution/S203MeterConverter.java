package com._4meonweb.gt.cs1331.ch02.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolutionWithInput;
import java.math.BigDecimal;
import java.util.stream.Stream;

/** Reads a Celsius degree then converts it to Fahrenheit.
 *
 * @author Maxim */
public class S203MeterConverter extends AbstractSolutionWithInput {

  public S203MeterConverter() {
    super("2.3", "Meter Converter");
  }

  @Override
  public Stream<String> getAnswer() {
    final BigDecimal cnvr = BigDecimal.valueOf(0.305);
    var feet = getInput(0).nextBigDecimal().stripTrailingZeros();

    var meters = feet.multiply(cnvr)
          .stripTrailingZeros();

    return Stream.of(String.join(" ",
          feet.toPlainString(),
          "feet is",
          meters.toPlainString(),
          "meters"));
  }

  @Override
  public Stream<String> getInputLabel() {
    return Stream.of("a value for feet");
  }
}
