const expect = require("chai").expect;
const sltn = require("../solutions/1-11-projection");

describe("Solution 1.11", function () {
  describe("#answer()", function () {
    it("should return 6 lines", function () {
      const solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "In 2022 population is 314812583",
        "In 2023 population is 317592680",
        "In 2024 population is 320372777",
        "In 2025 population is 323152874",
        "In 2026 population is 325932971",
      ]);
    });
  });
});
