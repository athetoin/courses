const expect = require("chai").expect;
const sltn = require("../solutions/1-11-projection");

describe("Solution 1.11", function () {
  describe("#answer()", function () {
    it("should return 6 lines", function () {
      var solution = new sltn();
      var result = solution.answer();
      expect(6).is.equal(result.length);
    });
  });
});
