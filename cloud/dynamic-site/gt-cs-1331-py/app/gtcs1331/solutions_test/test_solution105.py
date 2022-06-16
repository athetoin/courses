'''Solution 1.5 test case'''

import unittest
from gtcs1331.solutions.solution105 import Solution105

class TestSolution105(unittest.TestCase):
    '''Solution 1.5 test'''
    def setUp(self):
        self._sltn = Solution105()

    def test_answer(self):
        '''Answer must return 0.839286'''
        self.assertListEqual(
            self._sltn.answer,
            ["0.839286"]
        )

if __name__ == '__main__':
    unittest.main()
