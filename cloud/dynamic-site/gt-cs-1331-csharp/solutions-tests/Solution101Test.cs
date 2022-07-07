namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution101Test {
    Solution101? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution101();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
        new[] {
          "Welcome to C#",
          "Welcome to Computer Science",
          "Programming is fun"
        },
        solution1!.Answers.ToList());
    }
  }
}