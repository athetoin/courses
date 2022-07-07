'''Solution 1.10 test case'''

import unittest
from gtcs1331.solutions.solution113 import Solution113

class TestSolution113(unittest.TestCase):
    '''Solution 1.13 test'''
    def setUp(self):
        self._sltn = Solution113()

    def test_answer(self):
        '''Answer should return 2.623901 and 0.708740'''
        self.assertListEqual(
            self._sltn.answer, [
                "x = 2.623901",
                "y = 0.70874"],
            'should return 2.623901 and 0.708740'
        )

if __name__ == '__main__':
    unittest.main()
