from conoutput.solutions import Solutions
import importlib
from solutions.solution import Solution

def answer():
    print("\n-----------------------------")
    print(sltn_sel.label)
    print("-----------------------------")
    print(*sltn_sel.answer, sep="\n")

def list_solution(slts:Solutions):
    print("Solutions")
    print(*list(map(lambda sltn: "\t"+sltn.label, slts.list())),sep="\n")
    print("-----------------------------")
    sltn_id = str(input("Choose a solution: "))
    return slts.get_solution(sltn_id)

def mainloop():
    sel = str(input("\n(R)erun, (S)elect solution, (Q)uit: "))
    match sel:
        case "Q":
            return
        case "S":
            global sltn_sel
            sltn_sel = list_solution(slts)
            answer()
            mainloop()
        case "R":
            answer()
            mainloop()
        case _:
            mainloop()

slts = Solutions()
slts.module = importlib.import_module("solutions")
print("-----------------------------")
print("GT CS 1331 Chapter 1 (Python)")
print("-----------------------------")
sltn_sel = list_solution(slts)
answer()
mainloop()
