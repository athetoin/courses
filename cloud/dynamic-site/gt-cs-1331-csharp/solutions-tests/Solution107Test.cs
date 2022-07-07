namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution107Test {
    Solution107? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution107();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
        new string[] {
          "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = 2.976046",
          "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = 3.283738"
        },
        solution1!.Answers.ToList());
    }
  }
}