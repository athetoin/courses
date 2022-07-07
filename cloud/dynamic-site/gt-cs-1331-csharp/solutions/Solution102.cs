using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
  public class Solution102 : ImmutableSolution {
    public Solution102() :
        base("1.2", "Display five messages") {
    }

    public override IEnumerable<string> Answers => Enumerable.Repeat("Welcome to C#", 5);
  }
}