using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
  public class Solution107 : ImmutableSolution {
    public Solution107() :
      base("1.7", "Approximate PI") {
    }

    public override IEnumerable<string> Answers {
      get {
        double rslt1 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        double rslt2 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);

        return new string[] {
          $"4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = {rslt1:f6}",
          $"4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = {rslt2:f6}"};
      }
    }
  }
}