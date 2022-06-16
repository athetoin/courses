'''Solution 1.10 test case'''

import unittest
from gtcs1331.solutions.solution110 import Solution110

class TestSolution110(unittest.TestCase):
    '''Solution 1.10 test'''
    def setUp(self):
        self._sltn = Solution110()

    def test_answer(self):
        '''Answer should return average speed 11.538462'''
        self.assertListEqual(
            self._sltn.answer,
            ["Average speed is 11.538462 km/h"],
            'Answer should return average speed 11.538462'
        )

if __name__ == '__main__':
    unittest.main()
