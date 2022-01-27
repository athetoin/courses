describe("Solution 1.7", function () {
  describe("#answer()", function () {
    it("should return two results (2.976046 and 3.283738)", function () {
      var solution = new Solution107();
      var results = solution.answer().map((result) => result.split(" = ")[1]);
      expect(results[0]).is.equal("2.976046");
      expect(results[1]).is.equal("3.283738");
    });
  });
});
