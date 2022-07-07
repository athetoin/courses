'''Solution 1.11 test case'''

import unittest
from gtcs1331.solutions.solution111 import Solution111

class TestSolution111(unittest.TestCase):
    '''Solution 1.11 test'''
    def setUp(self):
        self._sltn = Solution111()

    def test_answer(self):
        '''Answer test'''
        self.assertListEqual(
            self._sltn.answer, [
                "In 2022 population is 314812583",
                "In 2023 population is 317592680",
                "In 2024 population is 320372777",
                "In 2025 population is 323152874",
                "In 2026 population is 325932971",
            ],
            'Answer should return exact numbers'
        )

if __name__ == '__main__':
    unittest.main()
