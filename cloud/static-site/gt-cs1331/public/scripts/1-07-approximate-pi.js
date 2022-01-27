class Solution107 extends Solution {
  id = "1.7";
  title = "Approximate PI";
  answer() {
    var rslt1 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
    var rslt2 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11
        + 1.0 / 13);
    return [`4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = ${rslt1.toFixed(6)}`,
    `4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = ${rslt2.toFixed(6)}`];
  }
}

allSolutions.push(new Solution107());
