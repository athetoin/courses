using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
  public class Solution113 : ImmutableSolution {
    public Solution113() :
        base("1.13", "Algebra") {
    }

    public override IEnumerable<string> Answers {
      get {
        double a_elmt = 3.4;
        double b_elmt = 50.2;
        double e_elmt = 44.5;
        double c_elmt = 2.1;
        double d_elmt = 0.55;
        double f_elmt = 5.9;
        double x_elmt = (e_elmt * d_elmt - b_elmt * f_elmt) / (a_elmt * d_elmt - b_elmt * c_elmt);
        double y_elmt = (a_elmt * f_elmt - e_elmt * c_elmt) / (a_elmt * d_elmt - b_elmt * c_elmt);

        return new[] {
          $"x = {x_elmt:f6}".TrimEnd(new[]{'0','.' }),
          $"y = {y_elmt:f6}".TrimEnd(new[]{'0','.' })
        };
      }
    }
  }
}