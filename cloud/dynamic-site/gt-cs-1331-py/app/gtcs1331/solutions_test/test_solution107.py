'''Solution 1.7 test case'''

import unittest
from gtcs1331.solutions.solution107 import Solution107

class TestSolution107(unittest.TestCase):
    '''Solution 1.7 test'''
    def setUp(self):
        self._sltn = Solution107()

    def test_answer(self):
        '''Answer should return two results (2.976046 and 3.283738)'''
        self.assertListEqual(
            self._sltn.answer, [
                "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = 2.976046",
                "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = 3.283738"]
        )

if __name__ == '__main__':
    unittest.main()
