namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution110Test {
    Solution110? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution110();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
        new[] {
          "Average speed is 11.538462 km/h",
        },
        solution1!.Answers.ToList());
    }
  }
}