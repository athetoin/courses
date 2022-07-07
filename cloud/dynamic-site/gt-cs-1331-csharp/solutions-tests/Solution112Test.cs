namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution112Test {
    Solution112? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution112();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
        new string[] {
          "8.947804 kilometers per hour"
        },
        solution1!.Answers.ToList());
    }
  }
}