const expect = require("chai").expect;
const sltn = require("../solutions/1-06-summation-series");

describe("Solution 1.6", function () {
  describe("#answer()", function () {
    it("should return answer with 45 in sum", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45"
      ]);
    });
  });
});
