import solutions.solution102
import unittest

class TestSolution103(unittest.TestCase):
    def setUp(self):
        self._sltn = solutions.solution103.Solution103()

    def test_answer(self):
        self.assertListEqual(
            self._sltn.answer,
            [
                "PPPP  Y   Y TTTTT H   H  OOO  N   N",
                "P   P  Y Y    T   H   H O   O NN  N",
                "PPPP    Y     T   HHHHH O   O N N N",
                "P       Y     T   H   H  OOO  N  NN"
                ])

if __name__ == '__main__':
    unittest.main()