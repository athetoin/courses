namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution106Test {
    Solution106? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution106();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
        new string[] {
          "1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45"
        },
        solution1!.Answers.ToList());
    }
  }
}