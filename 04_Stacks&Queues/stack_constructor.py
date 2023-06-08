class Node:
    def __init__(self,value):
        self.value = value
        self.next = None

class Stack:
    def __init__(self,value):
        newNode = Node(value)
        self.top = newNode
        self.height = 1
    
    def print_stack(self):
        curr = self.top
        while curr:
            print(curr.value)
            curr = curr.next

    def push(self, value):
        newNode = Node(value)
        if self.height == 0:
            self.top = newNode
        else:
            newNode.next = self.top
            self.top = newNode
        self.height += 1

    def pop(self):
        if self.height == 0:
            return None
        curr = self.top
        self.top = self.top.next
        curr.next = None
        self.height -= 1
        return curr

stack = Stack(10)
stack.push(5)
stack.push(16)
stack.push(20)
stack.print_stack()
stack.pop()
stack.print_stack()
        