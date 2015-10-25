
class DictToObject():

    """
    Convert a dict structure in a class instance

    How to use?:
        `ip_address = DictToObject(**{'id': 12, 'address' : '127.0.0.1'})`
    """

    def __init__(self, **properties):
        self.__dict__.update(properties)
