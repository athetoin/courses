namespace _4MeOnWeb.Solutions.Tests {
    [TestClass()]
    public class Solution104Test {
        Solution104? solution1;

        [TestInitialize]
        public void TestInitialize() {
            solution1 = new Solution104();
        }

        [TestMethod()]
        public void AnswerTest() {
            CollectionAssert.AreEqual(
                new string[] {
                    "a\ta^2\ta^3",
                    "1\t1\t1",
                    "2\t4\t8",
                    "3\t9\t27",
                    "4\t16\t64",
                },
                solution1!.Answers.ToList());
        }
    }
}