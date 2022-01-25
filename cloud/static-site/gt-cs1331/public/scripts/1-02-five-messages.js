class Solution102 extends Solution {
    id = "1.2"
    title = "Display five messages"
    answer() {
        var msg = 'Welcome to Programming'
        var lines = Array()
        Array.from(Array(5)).map((_, __) => lines.push(msg))
        return lines
    }
}

allSolutions.push(new Solution102());