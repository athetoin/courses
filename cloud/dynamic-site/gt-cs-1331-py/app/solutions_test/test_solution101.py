from solutions.solution101 import Solution101
import unittest

class TestSolution101(unittest.TestCase):
    def setUp(self):
        self._sltn = Solution101()

    def test_answer(self):
        self.assertListEqual(
            self._sltn.answer,
                ["Welcome to Python",
                "Welcome to Computer Science",
                "Programming is fun"])

if __name__ == '__main__':
    unittest.main()