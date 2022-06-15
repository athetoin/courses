'''Solution management service'''

from collections import namedtuple

class Solutions:
    '''Solution Management'''
    def __init__(self, module):
        names = filter(lambda name: name.startswith("Solution") and len(name) > 8, dir(module))
        slts = map(lambda nm: getattr(module, nm)(),names)
        self._solutions = list(slts)

    def list(self):
        '''Gets list of available solutions'''
        list_item = namedtuple("ListItem","id label order_number")
        return list(map(
            lambda sltn: list_item(sltn.id, sltn.label, sltn.order_number),
            self._solutions))

    def get_solution(self, id_):
        '''Gets solution response'''
        response = namedtuple("Response","label is_pattern answer")
        sltn = next(filter(lambda sltn: sltn.id==id_, self._solutions))
        return response(sltn.label, sltn.is_pattern, sltn.answer)
