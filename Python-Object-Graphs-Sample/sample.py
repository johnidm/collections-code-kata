x = []

x = []
y = [x, [x], dict(x=x)]
import objgraph
objgraph.show_refs([y], filename='sample-graph.png')
