namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution102Test {
    Solution102? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution102();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
          new string[] {
                    "Welcome to C#",
                    "Welcome to C#",
                    "Welcome to C#",
                    "Welcome to C#",
                    "Welcome to C#",
          },
          solution1!.Answers.ToList());
    }
  }
}