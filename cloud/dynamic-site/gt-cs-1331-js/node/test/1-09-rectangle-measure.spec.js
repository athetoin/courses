const expect = require("chai").expect;
const sltn = require("../solutions/1-09-rectangle-measure");

describe("Solution 1.9", function () {
  describe("#answer()", function () {
    it("should return perimeter 24.8 and area 35.55", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "perimeter = 24.8",
        "area = 35.55"
      ]);
    });
  });
});
