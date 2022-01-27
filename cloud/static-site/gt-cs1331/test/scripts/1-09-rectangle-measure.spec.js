describe("Solution 1.9", function () {
  describe("#answer()", function () {
    it("should return perimeter 24.8 and area 35.55", function () {
      var solution = new Solution109();
      var results = solution.answer().map((result) => result.split(" = ")[1]);
      expect(results[0]).is.equal("24.8");
      expect(results[1]).is.equal("35.55");
    });
  });
});
