'''Solution 1.7 implementation'''
from gtcs1331.solution_api.solution import Solution

class Solution107(Solution):
    '''Solution 1.7'''
    id = "1.7"
    title = "Approximate PI"

    def __answer(self):
        rslt1 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11)
        rslt2 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13)

        return [
            f"4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = {rslt1:.6f}",
            f"4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = {rslt2:.6f}"]

    answer = property(__answer)
