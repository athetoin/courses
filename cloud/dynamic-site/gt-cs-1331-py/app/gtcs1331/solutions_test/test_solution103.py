'''Solution 1.3 test case'''

import unittest
from gtcs1331.solutions.solution103 import Solution103

class TestSolution103(unittest.TestCase):
    '''Solution 1.3 test'''
    def setUp(self):
        self._sltn = Solution103()

    def test_answer(self):
        '''Test answer output'''
        self.assertListEqual(
            self._sltn.answer,
            [
                "PPPP  Y   Y TTTTT H   H  OOO  N   N",
                "P   P  Y Y    T   H   H O   O NN  N",
                "PPPP    Y     T   HHHHH O   O N N N",
                "P       Y     T   H   H  OOO  N  NN"
                ]
        )

if __name__ == '__main__':
    unittest.main()
