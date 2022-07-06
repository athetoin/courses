namespace _4MeOnWeb.Solutions.Tests {
    [TestClass()]
    public class Solution109Test {
        Solution109? solution1;

        [TestInitialize]
        public void TestInitialize() {
            solution1 = new Solution109();
        }

        [TestMethod()]
        public void AnswerTest() {
            CollectionAssert.AreEqual(
                new string[] {
                    "perimeter = 24.8",
                    "area = 35.55"
                },
                solution1!.Answers.ToList());
        }
    }
}