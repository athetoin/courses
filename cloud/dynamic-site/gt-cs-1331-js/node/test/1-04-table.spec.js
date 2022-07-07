const expect = require("chai").expect;
const sltn = require("../solutions/1-04-table");

describe("Solution 1.4", function () {
  describe("#answer()", function () {
    var solution = new sltn();
    it("should return 5 lines", function () {
      expect(solution.answer().length).is.equal(5);
    });
    it("should return 3 columns of known values", function () {
      expect(solution.answer()).is.deep.equal([
          "a\ta^2\ta^3",
          "1\t1\t1",
          "2\t4\t8",
          "3\t9\t27",
          "4\t16\t64"
        ]);
    });
  });
});
