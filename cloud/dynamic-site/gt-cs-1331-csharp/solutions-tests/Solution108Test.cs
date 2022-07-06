namespace _4MeOnWeb.Solutions.Tests {
    [TestClass()]
    public class Solution108Test {
        Solution108? solution1;

        [TestInitialize]
        public void TestInitialize() {
            solution1 = new Solution108();
        }

        [TestMethod()]
        public void AnswerTest() {
            CollectionAssert.AreEqual(
                new string[] {
                "perimeter = 34.557519",
                "area = 95.033178"
                },
                solution1!.Answers.ToList());
        }
    }
}