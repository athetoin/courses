namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution113Test {
    Solution113? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution113();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
        new string[] {
          "x = 2.623901",
          "y = 0.70874",
        },
        solution1!.Answers.ToList());
    }
  }
}