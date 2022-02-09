var Solution = require('./solution')

class Solution113 extends Solution {
  id = "1.13";
  title = "Algebra";
  answer() {
    var a = 3.4;
    var b = 50.2;
    var e = 44.5;
    var c = 2.1;
    var d = 0.55;
    var f = 5.9;
    var x = (e * d - b * f) / (a * d - b * c);
    var y = (a * f - e * c) / (a * d - b * c);
    return [`x = ${+(x).toFixed(6)}`, `y = ${+y.toFixed(6)}`];
  }
}

module.exports = Solution113