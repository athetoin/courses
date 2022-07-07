'''Solution 1.11 implementation'''
from gtcs1331.solution_api.solution import Solution

class Solution111(Solution):
    '''Solution 1.11'''
    id = "1.11"
    title = "Projection"

    def __answer(self):
        crnt_ppln = 312032486
        crnt_year = 2021
        sec_year = 365 * 24 * 60 * 60
        born_year = sec_year / 7
        death_year = sec_year / 13
        immgr_year = sec_year / 45
        dlt_year = round(born_year - death_year + immgr_year,0)

        return list(map(lambda year:
        f"In {int(crnt_year + year):d} population is {int(crnt_ppln + dlt_year * year):d}",
            list(range(1,6))))

    answer = property(__answer)
