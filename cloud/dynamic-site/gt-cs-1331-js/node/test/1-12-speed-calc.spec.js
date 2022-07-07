const expect = require("chai").expect;
const sltn = require("../solutions/1-12-speed-calc");

describe("Solution 1.12", function () {
  describe("#answer()", function () {
    it("should return 8.947804", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "8.947804 kilometers per hour"
      ]);
    });
  });
});
