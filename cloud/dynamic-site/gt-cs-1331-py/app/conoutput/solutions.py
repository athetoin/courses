from collections import namedtuple
from solutions.solution import Solution

class Solutions:
    def __set_module(self, module):
        names = filter(lambda name: name.startswith("Solution") and len(name) > 8, dir(module))
        slts = map(lambda nm: getattr(module, nm)(),names)
        self._solutions = list(slts)

    def list(self):
        list_item = namedtuple("ListItem","id label order_number")
        return list(map(lambda sltn: list_item(sltn.id, sltn.label, sltn.order_number), self._solutions))

    def get_solution(self, id):
        response = namedtuple("Response","label is_pattern answer")
        sltn = next(filter(lambda sltn: sltn.id==id, self._solutions))
        return response(sltn.label, sltn.is_pattern, sltn.answer)

    module = property(None, __set_module, None, "Set module with solutions")
