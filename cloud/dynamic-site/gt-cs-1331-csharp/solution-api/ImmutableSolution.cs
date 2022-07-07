namespace _4MeOnWeb.SolutionAPI {
  public abstract class ImmutableSolution : ISolution {
    protected ImmutableSolution(string id, string title) {
      Id = id;
      Title = title;
      IsPattern = false;
    }

    private string? _label;
    private int? _order;

    public string Id { get; }

    public int Order => _order ??= ((Func<int>)(() => {
      var parts = Id.Split('.');
      return int.Parse(parts[0]) * 100
        + int.Parse(parts[1]);
    }))();

    public string Title { get; }

    public string Label => _label ??= $"{Id}: {Title}";

    public bool IsPattern { get; }

    public IEnumerable<(string, string)> InputLabels =>
        Enumerable.Empty<(string, string)>();

    public IEnumerable<string> Inputs {
      get => Enumerable.Empty<string>();
      set {/*do nothing by default*/}
    }

    public abstract IEnumerable<string> Answers { get; }

    public class SolutionItem : ISolution.ISolutionItem {
      public SolutionItem(ISolution parent) {
        Id = parent.Id;
        Label = parent.Label;
        Order = parent.Order;
      }

      public string Id { get; }

      public int Order { get; }

      public string Label { get; }
    }

    ISolution.ISolutionItem ISolution.Item => new SolutionItem(this);

    public class SolutionAnswer : ISolution.ISolutionAnswer {
      public SolutionAnswer(ISolution parent) {
        Label = parent.Label;
        IsPattern = parent.IsPattern;
        Answers = parent.Answers;
        InputLabels = parent.InputLabels;
      }
      public string Label { get; }

      public bool IsPattern { get; }

      public IEnumerable<string> Answers { get; }

      public IEnumerable<(string, string)> InputLabels { get; }
    }

    ISolution.ISolutionAnswer ISolution.OutputAnswer => new SolutionAnswer(this);
  }
}
