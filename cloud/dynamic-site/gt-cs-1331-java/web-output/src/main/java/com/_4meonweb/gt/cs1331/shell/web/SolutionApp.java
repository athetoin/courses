package com._4meonweb.gt.cs1331.shell.web;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/solutions")
public class SolutionApp extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    final Set<Class<?>> classes = new HashSet<Class<?>>();
    classes.add(Solutions.class);
    return classes;
  }
}
