'''Solution 1.4 test case'''

import unittest
from gtcs1331.solutions.solution104 import Solution104

class TestSolution104(unittest.TestCase):
    '''Solution 1.4 test'''
    def setUp(self):
        self._sltn = Solution104()

    def test_answer(self):
        '''Test answer output'''
        self.assertListEqual(
            self._sltn.answer,
            list(map("\t".join,
                [
                    ["a", "a^2", "a^3"],
                    ["1", "1", "1"],
                    ["2", "4", "8"],
                    ["3", "9", "27"],
                    ["4", "16", "64"]
                ]
            ))
        )

if __name__ == '__main__':
    unittest.main()
