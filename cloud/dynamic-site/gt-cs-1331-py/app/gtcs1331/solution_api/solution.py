'''Solution API'''

class Solution:
    '''Solution interface'''
    id = str(None)
    title = str(None)
    is_pattern = False

    def get_label(self):
        '''Gets label for output'''
        return f"{self.id}: {self.title}"

    def get_order_number(self):
        '''Gets order number for sorting'''
        parts = self.id.split(".")
        return int(parts[0]) * 100 + int(parts[1])

    label = property(get_label)
    order_number = property(get_order_number)
