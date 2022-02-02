class Solution111 extends Solution {
  id = "1.11";
  title = "Projection";
  answer() {
    var crntPpln = 312032486;
    var crntYear = 2021;
    var secYear = 365 * 24 * 60 * 60;
    var bornYear = secYear / 7;
    var deathYear = secYear / 13;
    var immgrYear = secYear / 45;
    var dltYear = bornYear - deathYear + immgrYear;
    return Array.from(
      Array(6),
      (_, i) =>
        `In ${(crntYear + i).toFixed(0)} population is ${(
          crntPpln +
          dltYear * i
        ).toFixed(0)}`
    );
  }
}
