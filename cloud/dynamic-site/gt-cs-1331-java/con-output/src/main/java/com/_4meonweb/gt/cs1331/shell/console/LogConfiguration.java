package com._4meonweb.gt.cs1331.shell.console;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/** Console logging configuration.
 *
 * @author Maxim */
public class LogConfiguration {
  /** Class logger. */
  private static final Logger LOGGER = Logger
      .getLogger(LogConfiguration.class.getName());

  /** Load logging configuration from resource file. */
  public LogConfiguration() {
    super();
    try (
        InputStream is = Thread.currentThread().getContextClassLoader()
            .getResourceAsStream("logging.properties")) {
      LogManager.getLogManager().readConfiguration(is);
    } catch (IOException ex) {
      LOGGER.severe("Could not open logging configuration file.");
    }
  }

}
