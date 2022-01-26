describe("Solution 1.4", function () {
  describe("#answer()", function () {
    it("should return 5 lines", function () {
      var solution = new Solution104();
      expect(solution.answer().length).is.equal(5);
    });
    it("should return 3 columns", function () {
      var solution = new Solution104();
      solution
        .answer()
        .forEach((line) => expect(line.split("\x09").length).is.equal(3));
    });
  });
});
