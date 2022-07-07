using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
  public class Solution104 : ImmutableSolution {
    public Solution104() :
        base("1.4", "Table") {
    }

    public override IEnumerable<string> Answers =>
      new string[] { "a\ta^2\ta^3" }.Concat(
        Enumerable.Range(1, 4).Select(x => String.Join("\t",
          new string[] { $"{x}", $"{Math.Pow(x, 2)}", $"{Math.Pow(x, 3)}" })
        ));
  }
}