const expect = require("chai").expect;
const sltn = require("../solutions/1-07-approximate-pi");

describe("Solution 1.7", function () {
  describe("#answer()", function () {
    it("should return two results (2.976046 and 3.283738)", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = 2.976046",
        "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = 3.283738",
      ]);
    });
  });
});
