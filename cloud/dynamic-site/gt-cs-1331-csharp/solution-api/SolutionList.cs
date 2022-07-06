using static _4MeOnWeb.SolutionAPI.ISolution;

namespace _4MeOnWeb.SolutionAPI {
    public class SolutionList {
        private readonly IEnumerable<ISolution> _solutions;

        public SolutionList(IEnumerable<ISolution> solutions) {
            _solutions = solutions;
        }

        public IEnumerable<ISolutionItem> List => _solutions.Select(sltn => sltn.Item);

        public ISolution? GetSolution(string? sltn_id) {
            return _solutions.FirstOrDefault(sltn => sltn!.Id == sltn_id, null);
        }
    }
}
