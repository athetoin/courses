const expect = require("chai").expect;
const sltn = require("../solutions/1-02-five-messages");

describe("Solution 1.2", function () {
  describe("#answer()", function () {
    it("should return 5 predefined lines", function () {
      var string = "Welcome to Java";
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal(Array(5).fill(string));
    });
  });
});
