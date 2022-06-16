'''Solution 1.6 implementation'''
from functools import reduce
from gtcs1331.solution_api.solution import Solution

class Solution106(Solution):
    '''Solution 1.6'''
    id = "1.6"
    title = "Summation series"

    def __answer(self):
        result = reduce(lambda a,b:a+b, range(1,10))
        return [f"1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = {result}"]

    answer = property(__answer)
