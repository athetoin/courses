const expect = require("chai").expect;
const sltn = require("../solutions/1-03-pattern");

describe("Solution 1.3", function () {
  describe("#answer()", function () {
    it("should return 4 predefined lines", function () {
      var solution = new sltn();
      expect(solution.answer()).is.deep.equal([
        "    J     A   V       V   A      SSS   CCC  RRR  III PPPP  TTTTT",
        "    J    A A   V     V   A A    S     C   C R  R  I  P   P   T  ",
        "    J   A   A   V   V   A   A    SSS  C     RRR   I  PPPP    T  ",
        "J   J  AAAAAAA   V V   AAAAAAA      S C   C R R   I  P       T  ",
        " JJJ  A       A   V   A       A  SSS   CCC  R  R III P       T  ",
      ]);
    });
  });
});
