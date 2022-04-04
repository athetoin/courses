package com._4meonweb.gt.cs1331.shell.console;

import com._4meonweb.gt.cs1331.shell.api.Solution;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

/** Output result on console.
 *
 * @author Maxim */
@Singleton
public class Shell {
  /** Class logger. */
  private static final Logger LOG = Logger.getLogger(Shell.class.getName());

  public static final String UI_LABEL = "Enter solution ID (or 'q' for exit): ";

  /** Create Shell. */
  public Shell() {
    super();
  }

  /** Solution beans. */
  @Inject
  private transient Instance<Solution> dnmcSlns;

  /** Input scanner. */
  @Inject
  private transient Scanner scnr;

  /** Scanner maker.
   *
   * @author Maxim */
  public static class ScannerMaker {
    /** Scanner maker.
     *
     * @return the maker */
    @Produces
    public Scanner makeScanner() {
      return new Scanner(System.in);
    }
  }

  /** Output solutions.
   *
   * @param event the initialization event
   * @param parameters application parameters */
  public void outputSolutions(@Observes ContainerInitialized event,
        @Parameters List<String> parameters) {
    Boolean run = true;
    while (run) {
      LOG.info(() -> UI_LABEL);
      run &= scnr.hasNextLine();
      if (run) {
        var input = scnr.nextLine();
        run &= !input.equals("q");
        if (run) {
          final var ids = Arrays.asList(input.split("\\s"));
          dnmcSlns.stream()
                .filter(sltn -> ids.contains(sltn.getId()))
                .sorted((h1, h2) -> comparator(h1, h2))
                .forEach(this::runSolution);
        }
      }
    }
  }

  private void runSolution(Solution solution) {
    List<String> input = new ArrayList<>();
    solution.getInputLabel().forEach(inp -> {
      LOG.info(() -> "Enter " + inp + ": ");
      input.add(scnr.nextLine());
    });

    solution.setInput(input.stream());
    LOG.info(() -> solution.getId() + ":"
          + System.lineSeparator()
          + solution.getAnswer()
                .collect(Collectors.joining(System.lineSeparator()))
          + System.lineSeparator());
  }

  private static int comparator(Solution solution1, Solution solution2) {
    String[] idCompVal = solution1.getId().split("\\.");
    Integer idVal1 = Integer.parseInt(idCompVal[0]) * 100
          + Integer.parseInt(idCompVal[1]);
    idCompVal = solution2.getId().split("\\.");
    var idVal2 = Integer.parseInt(idCompVal[0]) * 100
          + Integer.parseInt(idCompVal[1]);
    return idVal1.compareTo(idVal2);
  }
}
