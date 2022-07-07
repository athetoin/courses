namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution105Test {
    Solution105? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution105();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
        new string[] {
          "0.839286",
        },
        solution1!.Answers.ToList());
    }
  }
}