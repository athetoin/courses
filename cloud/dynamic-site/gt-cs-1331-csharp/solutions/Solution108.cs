using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
    public class Solution108 : ImmutableSolution {
        public Solution108() :
            base("1.8", "Circle measure") {
        }

        public override IEnumerable<string> Answers {
            get {
                double rds = 5.5;
                double prmr = 2 * rds * Math.PI;
                double area = rds * rds * Math.PI;

                return new string[] {
                    $"perimeter = {prmr:f6}",
                    $"area = {area:f6}"
                };
            }
        }
    }
}