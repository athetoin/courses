import solutions.solution101
import unittest

class TestSolution101(unittest.TestCase):
    def setUp(self):
        self._sltn = solutions.solution101.Solution101()

    def test_answer(self):
        self.assertListEqual(
            self._sltn.answer,
                ["Welcome to Java",
                "Welcome to Computer Science",
                "Programming is fun"])

if __name__ == '__main__':
    unittest.main()