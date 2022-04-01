package com._4meonweb.gt.cs1331.ch01.solution;

import com._4meonweb.gt.cs1331.shell.api.AbstractSolution;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** Write a program that displays the table.
 *
 * @author Maxim */
public class S104Table extends AbstractSolution {
  public S104Table() {
    super("1.4", "Table", true);
  }

  @Override
  public Stream<String> getAnswer() {
    return Stream.concat(
        Stream.of(String.join("\t", "a", "a^2", "a^3")),
        IntStream.rangeClosed(1, 4)
            .mapToObj(
                i -> IntStream.of(i, (int) Math.pow(i, 2), (int) Math.pow(i, 3))
                    .mapToObj(Integer::toString)
                    .collect(Collectors.joining("\t"))));
  }
}
