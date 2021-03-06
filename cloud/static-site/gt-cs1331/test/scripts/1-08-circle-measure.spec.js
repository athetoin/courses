describe("Solution 1.8", function () {
  describe("#answer()", function () {
    it("should return perimeter 34.557519 and area 95.033178", function () {
      var solution = new Solution108();
      var results = solution.answer().map((result) => result.split(" = ")[1]);
      expect(results[0]).is.equal("34.557519");
      expect(results[1]).is.equal("95.033178");
    });
  });
});
