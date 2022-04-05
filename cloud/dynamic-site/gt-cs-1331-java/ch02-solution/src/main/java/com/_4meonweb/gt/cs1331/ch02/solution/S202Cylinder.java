package com._4meonweb.gt.cs1331.ch02.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolutionWithInput;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;

/** Reads a radius and a length of cylinder and calculates area/volume.
 *
 * @author Maxim */
public class S202Cylinder extends AbstractSolutionWithInput {

  public S202Cylinder() {
    super("2.2", "Cylinder");
  }

  @Override
  public Stream<String> getAnswer() {
    var radius = getInput(0).nextBigDecimal().stripTrailingZeros();
    var length = getInput(0).nextBigDecimal().stripTrailingZeros();

    var area = radius.multiply(radius)
          .multiply(BigDecimal.valueOf(Math.PI))
          .setScale(4, RoundingMode.HALF_EVEN)
          .stripTrailingZeros();
    var volume = area.multiply(length).setScale(4, RoundingMode.HALF_EVEN)
          .stripTrailingZeros();

    return Stream.of(
          "For cylinder with radius " + radius.toPlainString() + " and length "
                + length.toPlainString(),
          "The area is " + area.toPlainString(),
          "The volume is " + volume.toPlainString());
  }

  @Override
  public Stream<String> getInputLabel() {
    return Stream.of("a radius and a length of a cylinder");
  }
}
