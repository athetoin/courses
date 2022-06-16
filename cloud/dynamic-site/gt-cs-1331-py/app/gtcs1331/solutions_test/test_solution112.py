'''Solution 1.12 test case'''

import unittest
from gtcs1331.solutions.solution112 import Solution112

class TestSolution110(unittest.TestCase):
    '''Solution 1.12 test'''
    def setUp(self):
        self._sltn = Solution112()

    def test_answer(self):
        '''Answer should return speed 8.947804'''
        self.assertListEqual(
            self._sltn.answer,
            ["8.947804 kilometers per hour"],
            'should return speed 8.947804'
        )

if __name__ == '__main__':
    unittest.main()
