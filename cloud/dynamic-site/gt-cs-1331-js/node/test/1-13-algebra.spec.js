const expect = require("chai").expect;
const sltn = require("../solutions/1-13-algebra");

describe("Solution 1.13", function () {
  describe("#answer()", function () {
    var solution = new sltn();
    it("should return X equal 2.623901", function () {
      expect("2.623901").is.equal(solution.answer()[0].split(" ")[2]);
    });
    it("should return Y equal 0.70874", function () {
      expect("0.70874").is.equal(solution.answer()[1].split(" ")[2]);
    });
  });
});
