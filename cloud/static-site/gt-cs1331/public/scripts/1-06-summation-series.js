class Solution106 extends Solution {
  id = "1.6";
  title = "Summation series";
  answer() {
    var result = [...Array(9).keys()]
      .map((num) => num + 1)
      .reduce((sum, current) => sum + current);
    return ["1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + result];
  }
}

allSolutions.push(new Solution106());
