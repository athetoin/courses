using _4MeOnWeb.SolutionAPI;

namespace _4MeOnWeb.Solutions {
    public class Solution110 : ImmutableSolution {
        public Solution110() :
            base("1.10", "Average Speed") {
        }

        public override IEnumerable<string> Answers {
            get {
                double speed = 14.0 / 1.6 / (45.0 / 60.0 + 30.0 / 60.0 / 60.0);

                return new[] {
                    $"Average speed is {speed:f6} km/h"
                    };
            }
        }
    }
}