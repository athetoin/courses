package com._4meonweb.gt.cs1331.shell.web;

import com._4meonweb.gt.cs1331.shell.api.Solution;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;

public interface SolutionViews extends Solution {

  interface SolutionItem {
    @XmlElement
    String getId();

    @XmlElement
    int getOrder();

    @XmlElement
    String getLabel();
  }

  default SolutionItem getItem() {
    return new SolutionItem() {

      @Override
      public String getId() {
        return SolutionViews.this.getId();
      }

      @Override
      public int getOrder() {
        return SolutionViews.this.getOrder();
      }

      @Override
      public String getLabel() {
        return SolutionViews.this.getLabel();
      }
    };
  }

  interface SolutionAnswer {
    @XmlElement(name = "isPattern")
    boolean isPattern();

    @XmlElement
    List<String> getOutput();
  }

  default SolutionAnswer outputAnswer() {
    return new SolutionAnswer() {

      @Override
      public boolean isPattern() {
        return SolutionViews.this.isPattern();
      }

      @Override
      public List<String> getOutput() {
        return SolutionViews.this.getAnswer();
      }

    };
  }
}
