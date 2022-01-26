describe("Solution 1.3", function () {
  describe("#answer()", function () {
    it("should return 4 predefined lines", function () {
      var solution = new Solution103();
      expect(solution.answer()).is.deep.equal([
        "    J    A    V     V    A",
        "    J   A A    V   V    A A",
        "J   J  AAAAA    V V    AAAAA",
        " J J  A     A    V    A     A",
      ]);
    });
  });
});
