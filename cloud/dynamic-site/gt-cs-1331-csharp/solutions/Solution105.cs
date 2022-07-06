using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
    public class Solution105 : ImmutableSolution {
        public Solution105() :
            base("1.5", "Computator") {
        }

        public override IEnumerable<string> Answers =>
            new string[] { $"{(9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5):f6}" };
    }
}