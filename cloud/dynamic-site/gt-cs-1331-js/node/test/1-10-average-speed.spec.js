const expect = require("chai").expect;
const sltn = require("../solutions/1-10-average-speed");

describe("Solution 1.10", function () {
  describe("#answer()", function () {
    it("should return average speed 11.538462", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "Average speed is 11.538462 km/h"
      ]);
    });
  });
});
