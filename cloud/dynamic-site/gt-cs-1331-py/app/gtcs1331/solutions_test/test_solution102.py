'''Solution 1.2 test case'''

import unittest
from gtcs1331.solutions.solution102 import Solution102

class TestSolution102(unittest.TestCase):
    '''Solution 1.2 test'''
    def setUp(self):
        self._sltn = Solution102()

    def test_answer(self):
        '''Test answer output'''

        msg = "Welcome to Python"

        self.assertListEqual(
            self._sltn.answer,
                [msg,msg,msg,msg,msg])

if __name__ == '__main__':
    unittest.main()
