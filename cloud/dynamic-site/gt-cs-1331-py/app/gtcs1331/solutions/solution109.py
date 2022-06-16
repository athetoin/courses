'''Solution 1.9 implementation'''
from gtcs1331.solution_api.solution import Solution

class Solution109(Solution):
    '''Solution 1.9'''
    id = "1.9"
    title = "Rectangle measure"

    def __answer(self):
        width = 4.5
        length = 7.9
        perimeter = 2 * (width + length)
        area = width * length

        return [
            f"perimeter = {perimeter:.6f}".rstrip('0').rstrip('.'),
            f"area = {area:.6f}".rstrip('0').rstrip('.')]

    answer = property(__answer)
