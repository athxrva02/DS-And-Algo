class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class Queue:
    def __init__(self, value) -> None:
        newNode = Node(value)
        self.first = newNode
        self.last = newNode
        self.length = 1

    def print_queue(self):
        curr = self.first
        while curr:
            print(curr.value)
            curr = curr.next
    
    def enqueue(self, value):
        newNode = Node(value)
        if self.length == 0:
            self.first = newNode
            self.last = newNode
        else:
            self.last.next = newNode
            self.last = newNode
        self.length += 1

    def dequeue(self):
        if self.length == 0:
            return None
        else:
            curr = self.first
            self.first = self.first.next
            curr.next = None
            self.length -= 1
            if self.length == 0:
                self.last = None
            return curr
        
q = Queue(10)
q.enqueue(5)
q.enqueue(16)
q.print_queue()
q.dequeue()
q.print_queue()