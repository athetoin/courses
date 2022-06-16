'''Solution 1.8 implementation'''
import math
from gtcs1331.solution_api.solution import Solution

class Solution108(Solution):
    '''Solution 1.8'''
    id = "1.8"
    title = "Circle measure"

    def __answer(self):
        rds = 5.5
        prmr = 2 * rds * math.pi
        area = rds * rds * math.pi

        return [
            f"perimeter = {prmr:.6f}",
            f"area = {area:.6f}"]

    answer = property(__answer)
