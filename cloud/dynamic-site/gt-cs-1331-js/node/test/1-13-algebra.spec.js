const expect = require("chai").expect;
const sltn = require("../solutions/1-13-algebra");

describe("Solution 1.13", function () {
  describe("#answer()", function () {
    const solution = new sltn();
    it("should return X equal 2.623901 and Y equal 0.70874", function () {
      expect(solution.answer()).is.deep.equal([
        "x = 2.623901",
        "y = 0.70874",
      ]);
    });
  });
});
