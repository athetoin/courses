'''Solution 1.8 test case'''

import unittest
from gtcs1331.solutions.solution108 import Solution108

class TestSolution108(unittest.TestCase):
    '''Solution 1.8 test'''
    def setUp(self):
        self._sltn = Solution108()

    def test_answer(self):
        '''Answer should return perimeter 34.557519 and area 95.033178'''
        self.assertListEqual(
            self._sltn.answer, [
                "perimeter = 34.557519",
                "area = 95.033178"]
        )

if __name__ == '__main__':
    unittest.main()
