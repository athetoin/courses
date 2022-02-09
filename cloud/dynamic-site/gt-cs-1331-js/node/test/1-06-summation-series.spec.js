const expect = require("chai").expect;
const sltn = require("../solutions/1-06-summation-series");

describe("Solution 1.6", function () {
  describe("#answer()", function () {
    it("should return answer with 45 in sum", function () {
      var solution = new sltn();
      var line = solution.answer()[0];
      expect(line.substring(line.length - 2)).is.equal("45");
    });
  });
});
