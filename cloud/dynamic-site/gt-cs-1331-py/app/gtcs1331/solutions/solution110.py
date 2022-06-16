'''Solution 1.10 implementation'''
from gtcs1331.solution_api.solution import Solution

class Solution110(Solution):
    '''Solution 1.10'''
    id = "1.10"
    title = "Average Speed"

    def __answer(self):
        speed = 14.0 / 1.6 / (45.0 / 60.0 + 30.0 / 60.0 / 60.0)

        return [
            f"Average speed is {speed:.6f} km/h"]

    answer = property(__answer)
