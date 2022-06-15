class Solution:
    id = None
    title = None
    is_pattern = False

    def __get_label(self):
        return "{id}: {title}".format(id=self.id, title=self.title)

    def __get_order_number(self):
        parts = self.id.split(".")
        return int(parts[0]) * 100 + int(parts[1])

    label = property(__get_label)
    order_number = property(__get_order_number)