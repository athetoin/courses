using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
  public class Solution111 : ImmutableSolution {
    public Solution111() :
        base("1.11", "Projection") {
    }

    public override IEnumerable<string> Answers {
      get {
        long crnt_ppln = 312032486;
        int crnt_year = 2021;
        double sec_year = 365 * 24 * 60 * 60;
        double born_year = sec_year / 7;
        double death_year = sec_year / 13;
        double immgr_year = sec_year / 45;
        long dlt_year = Convert.ToInt64(Math.Round(born_year - death_year + immgr_year));

        return Enumerable.Range(1, 5)
          .Select(year =>
            $"In {crnt_year + year:d} population is {crnt_ppln + dlt_year * year:d}");
      }
    }
  }
}