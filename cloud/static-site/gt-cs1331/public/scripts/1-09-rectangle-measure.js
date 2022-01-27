class Solution109 extends Solution {
  id = "1.9";
  title = "Rectangle measure";
  answer() {
    var width = 4.5;
    var length = 7.9;
    var perimeter = 2 * (width + length);
    var area = width * length;
    return [
      `perimeter = ${+perimeter.toFixed(6)}`,
      `area = ${+area.toFixed(6)}`,
    ];
  }
}

allSolutions.push(new Solution109());
