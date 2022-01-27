class Solution110 extends Solution {
  id = "1.10";
  title = "Average Speed";
  answer() {
    var speed = 14.0 / 1.6 / (45.0 / 60.0 + 30.0 / 60.0 / 60.0);
    return [`Average speed is ${+speed.toFixed(6)} km/h`];
  }
}

allSolutions.push(new Solution110());
