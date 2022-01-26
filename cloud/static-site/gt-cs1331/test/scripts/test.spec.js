var expect = chai.expect;

describe("Solution 1.1", function () {
  describe("#answer()", function () {
    it("should return 3 predefined lines", function () {
      var solution = new Solution101();
      expect(solution.answer()).is.deep.equal([
        "Welcome to Java",
        "Welcome to Computer Science",
        "Programming is fun",
      ]);
    });
  });
});

describe("Solution 1.2", function () {
  describe("#answer()", function () {
    it("should return 5 predefined lines", function () {
      var string = "Welcome to Java";
      var solution = new Solution102();
      expect(solution.answer()).is.deep.equal(Array(5).fill(string));
    });
  });
});

describe("Solution 1.3", function () {
  describe("#answer()", function () {
    it("should return 4 predefined lines", function () {
      var solution = new Solution103();
      expect(solution.answer()).is.deep.equal([
        "    J    A    V     V    A",
        "    J   A A    V   V    A A",
        "J   J  AAAAA    V V    AAAAA",
        " J J  A     A    V    A     A",
      ]);
    });
  });
});

describe("Solution 1.4", function () {
  describe("#answer()", function () {
    it("should return 5 lines", function () {
      var solution = new Solution104();
      expect(solution.answer().length).is.equal(5);
    });
    it("should return 3 columns", function () {
      var solution = new Solution104();
      solution
        .answer()
        .forEach((line) => expect(line.split("\x09").length).is.equal(3));
    });
  });
});

describe("Solution 1.5", function () {
  describe("#answer()", function () {
    it("should return 0.839286", function () {
      var solution = new Solution105();
      expect(parseFloat(solution.answer()[0])).is.equal(0.839286);
    });
  });
});
