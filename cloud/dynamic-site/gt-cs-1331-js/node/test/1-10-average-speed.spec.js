const expect = require("chai").expect;
const sltn = require("../solutions/1-10-average-speed");

describe("Solution 1.10", function () {
  describe("#answer()", function () {
    it("should return average speed 11.538462", function () {
      var solution = new sltn();
      var result = solution.answer()[0].split(" ")[3];
      expect(result).is.equal("11.538462");
    });
  });
});
