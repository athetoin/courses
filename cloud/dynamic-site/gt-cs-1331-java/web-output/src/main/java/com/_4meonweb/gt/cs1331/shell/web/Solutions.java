package com._4meonweb.gt.cs1331.shell.web;

import com._4meonweb.gt.cs1331.shell.api.Solution;
import com._4meonweb.gt.cs1331.shell.web.SolutionViews.SolutionAnswer;
import com._4meonweb.gt.cs1331.shell.web.SolutionViews.SolutionItem;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

/** Solution service.
 *
 * @author Maxim */
@Path("/")
public class Solutions {

  /** Solution beans. */
  @Inject
  private transient Instance<Solution> solutionList;

  /** Gets solution list.
   *
   * @return the solution list */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<SolutionItem> getList() {
    return solutionList.stream().map(SolutionViewer::new)
          .map(SolutionViewer::getItem)
          .collect(Collectors.toList());
  }

  /** Gets solution answer output.
   *
   * @param id the solution ID
   * @return solution answer output */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public SolutionAnswer getAnswer(@PathParam("id") String id) {
    return solutionList.stream().filter(sltn -> sltn.getId().equals(id))
          .map(SolutionViewer::new).map(SolutionViewer::outputAnswer).findAny()
          .orElse(null);
  }
}
