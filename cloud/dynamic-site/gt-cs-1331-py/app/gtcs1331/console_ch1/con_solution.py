'''Console output with chapter 1 solutions'''

import importlib
from gtcs1331.solution_api.solutions import Solutions

class ConsoleApp():
    '''Console class'''
    def answer(self):
        '''Answer output'''
        print("\n-----------------------------")
        print(self.sltn_sel.label)
        print("-----------------------------")
        print(*self.sltn_sel.answer, sep="\n")

    def list_solution(self, solutions:Solutions):
        '''Provides list of loaded solutions and get selected ID'''
        print("Solutions")
        print(*list(map(lambda sltn: "\t"+sltn.label, self.slts.list())),sep="\n")
        print("-----------------------------")
        sltn_id = str(input("Choose a solution: "))
        return solutions.get_solution(sltn_id)

    def mainloop(self):
        '''Main interface loop'''
        sel = str(input("\n(R)erun, (S)elect solution, (Q)uit: "))
        match sel:
            case "Q" | "q":
                return
            case "S" | "s":
                self.sltn_sel = self.list_solution(self.slts)
                self.answer()
                self.mainloop()
            case "R" | "r":
                self.answer()
                self.mainloop()
            case _:
                self.mainloop()

    def __init__(self):
        self.slts = Solutions(importlib.import_module("gtcs1331.solutions"))
        print("-----------------------------")
        print("GT CS 1331 Chapter 1 (Python)")
        print("-----------------------------")
        self.sltn_sel = self.list_solution(self.slts)
        self.answer()
        self.mainloop()

ConsoleApp()
