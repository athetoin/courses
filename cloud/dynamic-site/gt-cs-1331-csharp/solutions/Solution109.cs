using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
  public class Solution109 : ImmutableSolution {
    public Solution109() :
        base("1.9", "Rectangle measure") {
    }

    public override IEnumerable<string> Answers {
      get {
        double width = 4.5;
        double length = 7.9;
        double perimeter = 2 * (width + length);
        double area = width * length;

        return new string[] {
          $"perimeter = {perimeter:f6}".TrimEnd(new[]{'0','.' }),
          $"area = {area:f6}".TrimEnd(new[]{'0','.' })
        };
      }
    }
  }
}