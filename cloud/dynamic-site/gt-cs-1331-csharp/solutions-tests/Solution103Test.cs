namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution103Test {
    Solution103? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution103();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
          new string[] {
                " CCC   S  S",
                "C   C SSSSSS",
                "C      S  S",
                "C   C SSSSSS",
                " CCC   S  S",
          },
          solution1!.Answers.ToList());
    }
  }
}