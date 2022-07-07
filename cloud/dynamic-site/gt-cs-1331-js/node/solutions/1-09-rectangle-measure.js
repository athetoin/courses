const Solution = require('./solution')

class Solution109 extends Solution {
  id = "1.9";
  title = "Rectangle measure";
  answer() {
    const width = 4.5;
    const length = 7.9;
    const perimeter = 2 * (width + length);
    const area = width * length;
    return [
      `perimeter = ${+perimeter.toFixed(6)}`,
      `area = ${+area.toFixed(6)}`,
    ];
  }
}

module.exports = Solution109