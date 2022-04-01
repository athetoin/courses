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

@Path("/")
public class Solutions {
  /** Solution beans. */
  @Inject
  private transient Instance<Solution> dnmcSlns;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<SolutionItem> getList() {
    return dnmcSlns.stream().map(SolutionViewer::new)
        .map(SolutionViewer::getItem)
        .collect(Collectors.toList());
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public SolutionAnswer getAnswer(@PathParam("id") String id) {
    return dnmcSlns.stream().filter(sltn -> sltn.getId().equals(id))
        .map(SolutionViewer::new).map(SolutionViewer::outputAnswer).findAny()
        .orElse(null);
  }
}
