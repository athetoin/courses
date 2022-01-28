class Solution112 extends Solution {
  id = "1.12";
  title = "Speed Calculator";
  answer() {
		var result = 24 / 1.6 / (1 + 40.0 / 60 + 35.0 / 60 / 60)
    return [`${+(result).toFixed(6)} kilometers per hour`];
  }
}

allSolutions.push(new Solution112());
