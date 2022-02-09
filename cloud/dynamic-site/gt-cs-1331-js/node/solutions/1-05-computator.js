var Solution = require('./solution')

class Solution105 extends Solution {
  id = "1.5";
  title = "Computator";
  answer() {
    return [((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)).toFixed(6)];
  }
}

module.exports = Solution105