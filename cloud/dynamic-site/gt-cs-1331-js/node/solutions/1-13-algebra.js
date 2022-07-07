const Solution = require('./solution')

class Solution113 extends Solution {
  id = "1.13";
  title = "Algebra";
  answer() {
    const a = 3.4;
    const b = 50.2;
    const e = 44.5;
    const c = 2.1;
    const d = 0.55;
    const f = 5.9;
    const x = (e * d - b * f) / (a * d - b * c);
    const y = (a * f - e * c) / (a * d - b * c);
    return [`x = ${+x.toFixed(6)}`, `y = ${+y.toFixed(6)}`];
  }
}

module.exports = Solution113