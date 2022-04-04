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

/** Console shell test.
 *
 * @author Maxim */
@EnableAutoWeld
class ShellTest {
  /** System Logger. */
  private static final Logger ROOT_LGR = Logger.getGlobal().getParent();

  /** Weld initialization. */
  @WeldSetup
  public WeldInitiator weld = WeldInitiator
        .from(Shell.class)
        .addBeans(createSolution1(), createSolution2(), createScanner())
        .build();

  /** Mocked Scanner bean. */
  private transient Scanner scnr;

  private Bean<?> createScanner() {
    return MockBean.builder()
          .types(Scanner.class)
          .create(o -> {
            scnr = new Scanner("q" + System.lineSeparator()
                  + ID1 + " " + ID2 + System.lineSeparator());
            return scnr;
          })
          .build();
  }

  /** Mocked Solution 1. */
  private transient Solution sltn1;
  /** Solution 1 ID. */
  private static transient String ID1 = "1.10";
  /** Solution 1 answer. */
  private static transient String ANSR1 = "stjw45w6";

  /** Mocked Solution 2. */
  private transient Solution sltn2;
  /** Solution 2 ID. */
  private static transient String ID2 = "1.2";
  /** Solution 1 answer. */
  private static transient String ANSR2 = "riliyasdrg";

  Bean<?> createSolution1() {
    return MockBean.builder()
          .types(Solution.class)
          .create(o -> {
            sltn1 = spy(Solution.class);
            when(sltn1.getId()).thenReturn(ID1);
            when(sltn1.getAnswer()).thenReturn(Stream.of(ANSR1));
            return sltn1;
          })
          .build();
  }

  Bean<?> createSolution2() {
    return MockBean.builder()
          .types(Solution.class)
          .create(o -> {
            sltn2 = spy(Solution.class);
            when(sltn2.getId()).thenReturn(ID2);
            when(sltn2.getAnswer()).thenReturn(Stream.of(ANSR2));
            return sltn2;
          })
          .build();
  }

  /** Tested Shell. */
  @Inject
  transient Shell shell;

  @Test
  void testLog() {
    var hndr = Mockito.mock(Handler.class);
    ROOT_LGR.addHandler(hndr);

    shell.outputSolutions(null, null);

    ROOT_LGR.removeHandler(hndr);
    var cptr = ArgumentCaptor.forClass(LogRecord.class);
    verify(hndr, times(4)).publish(cptr.capture());

    final Object[] slts = {
        Shell.UI_LABEL,
        ID2 + ":" + System.lineSeparator() + ANSR2 + System.lineSeparator(),
        ID1 + ":" + System.lineSeparator() + ANSR1 + System.lineSeparator(),
        Shell.UI_LABEL
    };
    final var logs = cptr.getAllValues().stream().map(LogRecord::getMessage)
          .toArray();
    assertArrayEquals(slts, logs, "Messages");
  }
}
