from solution_api.solution import Solution

class Solution104(Solution):
    id = "1.4"
    title = "Table"
    is_pattern = True
    table = ["\t".join(["a", "a^2", "a^3"])]
    table.extend(list(map(lambda i: "\t".join([str(i),str(i*i),str(i**3)]), range(1,5))))
    answer = table