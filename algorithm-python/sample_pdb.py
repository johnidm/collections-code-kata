class MyObject(object):

    def __init__(self, num_loops):
        self.count = num_loops

    def go(self):
    	import pdb; pdb.set_trace()
        for i in range(self.count):
            print(i)

if __name__ == '__main__':
    MyObject(5).go()
