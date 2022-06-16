'''Solution 1.12 implementation'''
from gtcs1331.solution_api.solution import Solution

class Solution112(Solution):
    '''Solution 1.12'''
    id = "1.12"
    title = "Speed Calculator"

    def __answer(self):
        speed = 24 / 1.6 / (1 + 40.0 / 60 + 35.0 / 60 / 60)

        return [f"{speed:.6f} kilometers per hour"]

    answer = property(__answer)
