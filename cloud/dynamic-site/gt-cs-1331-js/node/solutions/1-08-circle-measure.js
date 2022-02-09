var Solution = require('./solution')

class Solution108 extends Solution {
  id = "1.8";
  title = "Circle measure";
  answer() {
    var rds = 5.5;
    var prmr = 2 * rds * Math.PI;
    var area = rds * rds * Math.PI;
    return [`perimeter = ${prmr.toFixed(6)}`, `area = ${area.toFixed(6)}`];
  }
}

module.exports = Solution108