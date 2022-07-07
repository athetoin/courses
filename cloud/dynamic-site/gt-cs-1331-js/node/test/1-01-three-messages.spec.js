const expect = require("chai").expect;
const sltn = require("../solutions/1-01-three-messages");

describe("Solution 1.1", function () {
  describe("#answer()", function () {
    it("should return 3 predefined lines", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "Welcome to JavaScript",
        "Welcome to Computer Science",
        "Programming is fun",
      ]);
    });
  });
});
