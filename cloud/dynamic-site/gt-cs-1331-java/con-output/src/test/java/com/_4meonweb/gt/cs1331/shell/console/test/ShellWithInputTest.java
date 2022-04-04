package com._4meonweb.gt.cs1331.shell.console.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com._4meonweb.gt.cs1331.shell.api.Solution;
import com._4meonweb.gt.cs1331.shell.console.Shell;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.inject.Inject;
import java.util.Scanner;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.stream.Stream;
import org.jboss.weld.junit.MockBean;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

/** Console shell test with required input.
 *
 * @author Maxim */
@EnableAutoWeld
class ShellWithInputTest {
  /** System Logger. */
  private static final Logger ROOT_LGR = Logger.getGlobal().getParent();

  /** Weld initialization. */
  @WeldSetup
  public WeldInitiator weld = WeldInitiator
        .from(Shell.class)
        .addBeans(createSolution1(), createSolution2(), createScanner())
        .build();

  /** Tested Shell. */
  @Inject
  transient Shell shell;

  /** Mocked solution with required input. */
  private transient Solution solution1;
  /** Solution ID. */
  private static transient String ID1 = "2.10";
  /** Solution input. */
  private static transient String INPUT1 = "input label 1";
  /** Solution output. */
  private static transient String OUTPUT1 = "answer output 1";

  /** Mocked solution with required input. */
  private transient Solution solution2;
  /** Solution ID. */
  private static transient String ID2 = "2.15";
  /** Solution input. */
  private static transient String INPUT2 = "input label 2";
  /** Solution output. */
  private static transient String OUTPUT2 = "answer output 2";

  private Bean<?> createSolution1() {
    return MockBean.builder()
          .types(Solution.class)
          .create(o -> {
            solution1 = spy(Solution.class);
            when(solution1.getId()).thenReturn(ID1);
            when(solution1.getInputLabel()).thenReturn(Stream.of(INPUT1));
            when(solution1.getAnswer()).thenReturn(Stream.of(OUTPUT1));
            return solution1;
          })
          .build();
  }

  private Bean<?> createSolution2() {
    return MockBean.builder()
          .types(Solution.class)
          .create(o -> {
            solution2 = spy(Solution.class);
            when(solution2.getId()).thenReturn(ID2);
            when(solution2.getInputLabel()).thenReturn(Stream.of(INPUT2));
            when(solution2.getAnswer()).thenReturn(Stream.of(OUTPUT2));
            return solution2;
          })
          .build();
  }

  /** Mocked Scanner bean. */
  private transient Scanner scnr;

  private Bean<?> createScanner() {
    return MockBean.builder()
          .types(Scanner.class)
          .create(o -> {
            scnr = new Scanner("q" + System.lineSeparator() + ID1
                  + (" " + ID2).repeat(3) + System.lineSeparator()
                  + "input parameter for 1" + System.lineSeparator()
                  + "input parameter for 2" + System.lineSeparator());
            return scnr;
          })
          .build();
  }

  @Test
  void outputSolution_has_TwoSolutionOutput() {
    var hndr = Mockito.mock(Handler.class);
    ROOT_LGR.addHandler(hndr);

    shell.outputSolutions(null, null);

    ROOT_LGR.removeHandler(hndr);
    var cptr = ArgumentCaptor.forClass(LogRecord.class);
    verify(hndr, times(6)).publish(cptr.capture());

    final Object[] slts = {
        Shell.UI_LABEL,
        "Enter " + INPUT1 + ": ",
        ID1 + ":" + System.lineSeparator() + OUTPUT1 + System.lineSeparator(),
        "Enter " + INPUT2 + ": ",
        ID2 + ":" + System.lineSeparator() + OUTPUT2 + System.lineSeparator(),
        Shell.UI_LABEL
    };
    final var logs = cptr.getAllValues().stream().map(LogRecord::getMessage)
          .toArray();
    assertArrayEquals(slts, logs, "Messages");
  }
}
