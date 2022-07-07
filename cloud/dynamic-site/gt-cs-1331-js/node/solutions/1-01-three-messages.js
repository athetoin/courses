var Solution = require('./solution')

class Solution101 extends Solution {
  id = "1.1";
  title = "Display three messages";
  answer() {
    return [
      "Welcome to JavaScript",
      "Welcome to Computer Science",
      "Programming is fun",
    ];
  }
}

module.exports = Solution101