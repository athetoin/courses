'''Solution 1.9 test case'''

import unittest
from gtcs1331.solutions.solution109 import Solution109

class TestSolution109(unittest.TestCase):
    '''Solution 1.9 test'''
    def setUp(self):
        self._sltn = Solution109()

    def test_answer(self):
        '''Answer test'''
        self.assertListEqual(
            self._sltn.answer, [
                "perimeter = 24.8",
                "area = 35.55"],
            "should return perimeter 24.8 and area 35.55"
        )

if __name__ == '__main__':
    unittest.main()
