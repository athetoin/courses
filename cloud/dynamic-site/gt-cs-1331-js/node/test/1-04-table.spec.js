const expect = require("chai").expect;
const sltn = require("../solutions/1-04-table");

describe("Solution 1.4", function () {
  describe("#answer()", function () {
    var solution = new sltn();
    it("should return 5 lines", function () {
      expect(solution.answer().length).is.equal(5);
    });
    it("should return 3 columns", function () {
      solution
        .answer()
        .forEach((line) => expect(line.split("\x09").length).is.equal(3));
    });
  });
});
