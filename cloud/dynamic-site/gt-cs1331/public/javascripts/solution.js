class Solution {
  id;
  title;
  isPattern = false;
  answer() {
    return any;
  }
  get orderNumber() {
    var parts = this.id.split(".");
    return parseInt(parts[0], 10) * 100 + parseInt(parts[1], 10);
  }
  get label() {
    return this.id + ": " + this.title;
  }
}
