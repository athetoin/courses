import solutions.solution102
import unittest

class TestSolution102(unittest.TestCase):
    def setUp(self):
        self._sltn = solutions.solution102.Solution102()

    def test_answer(self):
        self.assertListEqual(
            self._sltn.answer,
                ["Welcome to Python"]*5)

if __name__ == '__main__':
    unittest.main()