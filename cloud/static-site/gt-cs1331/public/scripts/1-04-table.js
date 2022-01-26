class Solution104 extends Solution {
    id = "1.4"
    title = "Table"
    isPattern = true
    answer() {
        return [["a", "a^2", "a^3"].join("\x09")].concat(
            Array.from(Array(4), (_, i) => {
                var first = i + 1;
                var second = first + first;
                var third = first * second;
                return [[first, second, third].join('\x09')];
            }));
    }
}

allSolutions.push(new Solution104());