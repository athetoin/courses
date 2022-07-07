const expect = require("chai").expect;
const sltn = require("../solutions/1-08-circle-measure");

describe("Solution 1.8", function () {
  describe("#answer()", function () {
    it("should return perimeter 34.557519 and area 95.033178", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "perimeter = 34.557519",
        "area = 95.033178",
      ]);
    });
  });
});
