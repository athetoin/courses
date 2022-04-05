package com._4meonweb.gt.cs1331.ch02.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolutionWithInput;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.stream.Stream;

/** Reads a Celsius degree then converts it to Fahrenheit.
 *
 * @author Maxim */
public class S205Tip extends AbstractSolutionWithInput {

  public S205Tip() {
    super("2.5", "Tip");
  }

  @Override
  public Stream<String> getAnswer() {
    var sbtl = getInput(0).nextBigDecimal().stripTrailingZeros();
    var rate = getInput(0).nextBigDecimal().stripTrailingZeros();

    var grtt = sbtl.multiply(rate).divide(BigDecimal.valueOf(100))
          .stripTrailingZeros();
    var ttl = sbtl.add(grtt);

    return Stream.of(String.join(" ",
          "The gratuity is",
          NumberFormat.getCurrencyInstance().format(grtt),
          "and total is",
          NumberFormat.getCurrencyInstance().format(ttl)));
  }

  @Override
  public Stream<String> getInputLabel() {
    return Stream.of("the subtotal and a gratuity rate");
  }
}
