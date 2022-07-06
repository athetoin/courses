using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
    public class Solution112 : ImmutableSolution {
        public Solution112() :
            base("1.12", "Speed Calculator") {
        }

        public override IEnumerable<string> Answers {
            get {
                double speed = 24 / 1.6 / (1 + 40.0 / 60 + 35.0 / 60 / 60);

                return new[] { $"{speed:f6} kilometers per hour" };
            }
        }
    }
}