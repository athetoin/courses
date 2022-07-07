namespace _4MeOnWeb.Solutions.Tests {
  [TestClass()]
  public class Solution111Test {
    Solution111? solution1;

    [TestInitialize]
    public void TestInitialize() {
      solution1 = new Solution111();
    }

    [TestMethod()]
    public void AnswerTest() {
      CollectionAssert.AreEqual(
        new string[] {
          "In 2022 population is 314812583",
          "In 2023 population is 317592680",
          "In 2024 population is 320372777",
          "In 2025 population is 323152874",
          "In 2026 population is 325932971",
        },
        solution1!.Answers.ToList());
    }
  }
}