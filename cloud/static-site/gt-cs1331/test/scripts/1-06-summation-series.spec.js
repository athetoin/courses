describe("Solution 1.6", function () {
  describe("#answer()", function () {
    it("should return answer with 45 in sum", function () {
      var solution = new Solution106();
      var line = solution.answer()[0];
      expect(line.substring(line.length - 2)).is.equal("45");
    });
  });
});