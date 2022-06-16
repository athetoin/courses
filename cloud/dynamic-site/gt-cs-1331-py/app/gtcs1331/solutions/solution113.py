'''Solution 1.13 implementation'''
from gtcs1331.solution_api.solution import Solution

class Solution113(Solution):
    '''Solution 1.13'''
    id = "1.13"
    title = "Algebra"

    def __answer(self):
        a_elmt = 3.4
        b_elmt = 50.2
        e_elmt = 44.5
        c_elmt = 2.1
        d_elmt = 0.55
        f_elmt = 5.9
        x_elmt = (e_elmt * d_elmt - b_elmt * f_elmt) / (a_elmt * d_elmt - b_elmt * c_elmt)
        y_elmt = (a_elmt * f_elmt - e_elmt * c_elmt) / (a_elmt * d_elmt - b_elmt * c_elmt)

        return [
            f"x = {x_elmt:.6f}",
            f"y = {y_elmt:.6f}"]

    answer = property(__answer)
