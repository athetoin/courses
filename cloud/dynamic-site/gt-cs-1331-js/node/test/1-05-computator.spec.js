const expect = require("chai").expect;
const sltn = require("../solutions/1-05-computator");

describe("Solution 1.5", function () {
  describe("#answer()", function () {
    it("should return 0.839286", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "0.839286",
      ]);
    });
  });
});
