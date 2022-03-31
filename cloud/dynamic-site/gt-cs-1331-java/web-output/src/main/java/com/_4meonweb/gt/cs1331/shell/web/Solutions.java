package com._4meonweb.gt.cs1331.shell.web;

import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
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
  public List<Solution> getList() {
    return dnmcSlns.stream().collect(Collectors.toList());
  }
}
