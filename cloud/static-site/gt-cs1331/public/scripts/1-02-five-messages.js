class Solution102 extends Solution {
    id = "1.2"
    title = "Display five messages"
    answer() {
        return Array.from(Array(5),()=>"Welcome to Programming");
    }
}

allSolutions.push(new Solution102());