using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
    public class Solution103 : ImmutableSolution {
        public Solution103() :
            base("1.3", "Pattern") {
        }

        public override IEnumerable<string> Answers =>
            new string[] {
                " CCC   S  S",
                "C   C SSSSSS",
                "C      S  S",
                "C   C SSSSSS",
                " CCC   S  S",
        };
    }
}