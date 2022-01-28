describe("Solution 1.13", function () {
  describe("#answer()", function () {
    it("should return X equal 2.623901", function () {
      var solution = new Solution113();
      expect("2.623901").is.equal(solution.answer()[0].split(" ")[2]);
    });
    it("should return Y equal 0.70874", function () {
      var solution = new Solution113();
      expect("0.70874").is.equal(solution.answer()[1].split(" ")[2]);
    });
  });
});
