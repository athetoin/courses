var Solution = require("./solution");

class Solution103 extends Solution {
  id = "1.3";
  title = "Pattern";
  isPattern = true;
  answer() {
    return [
      "    J     A   V       V   A      SSS   CCC  RRR  III PPPP  TTTTT",
      "    J    A A   V     V   A A    S     C   C R  R  I  P   P   T  ",
      "    J   A   A   V   V   A   A    SSS  C     RRR   I  PPPP    T  ",
      "J   J  AAAAAAA   V V   AAAAAAA      S C   C R R   I  P       T  ",
      " JJJ  A       A   V   A       A  SSS   CCC  R  R III P       T  ",
    ];
  }
}

module.exports = Solution103;
