package com._4meonweb.gt.cs1331.ch02.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolutionWithInput;
import java.math.BigDecimal;
import java.util.stream.Stream;

/** Reads a Celsius degree then converts it to Fahrenheit.
 *
 * @author Maxim */
public class S204KilogramConverter extends AbstractSolutionWithInput {

  public S204KilogramConverter() {
    super("2.4", "Kilogram Converter");
  }

  @Override
  public Stream<String> getAnswer() {
    final BigDecimal cnvr = BigDecimal.valueOf(0.454);
    var feet = getInput(0).nextBigDecimal().stripTrailingZeros();

    var meters = feet.multiply(cnvr)
          .stripTrailingZeros();

    return Stream.of(String.join(" ",
          feet.toPlainString(),
          "pounds is",
          meters.toPlainString(),
          "kilograms"));
  }

  @Override
  public Stream<String> getInputLabel() {
    return Stream.of("a number in pounds");
  }
}
