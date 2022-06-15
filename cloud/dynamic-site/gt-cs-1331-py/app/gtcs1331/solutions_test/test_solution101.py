'''Solution 1.1 test case'''

import unittest
from gtcs1331.solutions.solution101 import Solution101

class TestSolution101(unittest.TestCase):
    '''Solution 1.1 test'''
    def setUp(self):
        self._sltn = Solution101()

    def test_answer(self):
        '''Test answer output'''
        self.assertListEqual(
            self._sltn.answer,
                ["Welcome to Python",
                "Welcome to Computer Science",
                "Programming is fun"])

if __name__ == '__main__':
    unittest.main()
