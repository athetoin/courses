using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
    public class Solution101 : ImmutableSolution {
        public Solution101() :
            base("1.1", "Display three messages") {
        }

        public override IEnumerable<string> Answers =>
            new string[] {
                "Welcome to C#",
                "Welcome to Computer Science",
                "Programming is fun"
        };
    }
}