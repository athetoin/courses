using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
    public class Solution106 : ImmutableSolution {
        public Solution106() :
            base("1.6", "Summation series") {
        }

        public override IEnumerable<string> Answers {
            get {
                int result = Enumerable.Range(1, 9).Sum();
                return new string[] { $"1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = {result}" };
            }
        }
    }
}