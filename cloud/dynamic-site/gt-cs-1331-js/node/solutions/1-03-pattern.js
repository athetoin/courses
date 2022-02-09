var Solution = require("./solution");

class Solution103 extends Solution {
  id = "1.3";
  title = "Pattern";
  isPattern = true;
  answer() {
    return [
      "    J    A    V     V    A",
      "    J   A A    V   V    A A",
      "J   J  AAAAA    V V    AAAAA",
      " J J  A     A    V    A     A",
    ];
  }
}

module.exports = Solution103;
