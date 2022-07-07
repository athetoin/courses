namespace _4MeOnWeb.SolutionAPI {
  public interface ISolution {
    string Id { get; }

    int Order { get; }

    string Title { get; }

    string Label { get; }

    bool IsPattern { get; }

    IEnumerable<string> Answers { get; }

    IEnumerable<string> Inputs { get; set; }

    IEnumerable<(string, string)> InputLabels { get; }

    public interface ISolutionItem {
      string Id { get; }
      int Order { get; }
      string Label { get; }
    }

    ISolutionItem Item { get; }

    public interface ISolutionAnswer {
      string Label { get; }
      bool IsPattern { get; }
      IEnumerable<string> Answers { get; }
      IEnumerable<(string, string)> InputLabels { get; }
    }

    ISolutionAnswer OutputAnswer { get; }
  }
}
