'''Solution 1.6 test case'''

import unittest
from gtcs1331.solutions.solution106 import Solution106

class TestSolution106(unittest.TestCase):
    '''Solution 1.6 test'''
    def setUp(self):
        self._sltn = Solution106()

    def test_answer(self):
        '''Answer must return  '1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45'''
        self.assertListEqual(
            self._sltn.answer,
            ["1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45"]
        )

if __name__ == '__main__':
    unittest.main()
