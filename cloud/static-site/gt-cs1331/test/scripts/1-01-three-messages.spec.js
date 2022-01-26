describe("Solution 1.1", function () {
  describe("#answer()", function () {
    it("should return 3 predefined lines", function () {
      var solution = new Solution101();
      expect(solution.answer()).is.deep.equal([
        "Welcome to Java",
        "Welcome to Computer Science",
        "Programming is fun",
      ]);
    });
  });
});