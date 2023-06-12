class Graph:
    def __init__(self) -> None:
        self.adj_list = {}
    
    def add_vertex(self, vertex):
        if vertex not in self.adj_list:
            self.adj_list[vertex] = []
            return True
        return False
    
    def add_edge(self, vertex1, vertex2):
        if vertex1 in self.adj_list.keys() and vertex2 in self.adj_list.keys():
            self.adj_list[vertex1].append(vertex2)
            self.adj_list[vertex2].append(vertex1)
            return True
        return False
    
    def remove_edge(self, vertex1, vertex2):
        if vertex1 in self.adj_list.keys() and vertex2 in self.adj_list.keys():
            try:
                self.adj_list[vertex1].remove(vertex2)
                self.adj_list[vertex2].remove(vertex1)
            except ValueError:
                pass
            return True
        return False

    def remove_vertex(self, vertex):
        if vertex in self.adj_list.keys():
            for other_vertex in self.adj_list[vertex]:
                self.adj_list[other_vertex].remove(vertex)
            del self.adj_list[vertex]
            return True
        return False
    
    def print_graph(self):
        for vertex in self.adj_list:
            print(vertex, "->", self.adj_list[vertex])

g = Graph()
g.add_vertex("A")
g.add_vertex("B")
g.add_edge("A", "B")
g.add_vertex("C")
g.add_edge("A", "C")
g.remove_edge("A", "B")
g.add_vertex("D")
g.add_edge("A", "D")
g.add_edge("B", "D")
g.add_edge("C", "D")
g.print_graph()
print()
g.remove_vertex("B")
g.print_graph()