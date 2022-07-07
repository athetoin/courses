const Solution = require('./solution')

class Solution111 extends Solution {
  id = "1.11";
  title = "Projection";
  answer() {
    const crntPpln = 312032486;
    const crntYear = 2021;
    const secYear = 365 * 24 * 60 * 60;
    const bornYear = secYear / 7;
    const deathYear = secYear / 13;
    const immgrYear = secYear / 45;
    const dltYear = Math.round(bornYear - deathYear + immgrYear);
    return Array.from(
      Array(5),
      (_, i) =>
        `In ${(crntYear + i + 1).toFixed(0)} population is ${(
          crntPpln +
          dltYear * (i + 1)
        ).toFixed(0)}`
    );
  }
}

module.exports = Solution111