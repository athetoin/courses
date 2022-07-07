var Solution = require('./solution')

class Solution102 extends Solution {
  id = "1.2";
  title = "Display five messages";
  answer() {
    return Array(5).fill("Welcome to JavaScript");
  }
}

module.exports = Solution102