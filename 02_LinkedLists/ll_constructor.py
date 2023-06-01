class Node:
    def __init__(self,value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self, value):
        new_node = Node(value)
        self.head = new_node
        self.tail = new_node
        self.length = 1

    def append(self, value):
        new_node = Node(value)
        if not self.head:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1
        return True


    def prepend(self, value):
        new_node = Node(value)
        if not self.head:
            self.head = new_node
            self.tail = new_node
        else:
            new_node.next = self.head
            self.head = new_node
        self.length += 1
        return True

    def insert(self, index, value):
        pass
    
    def pop(self):
        if not self.head:
            return None
        curr = self.head
        prev = self.head
        while(curr.next):
            prev = curr
            curr = curr.next
        self.tail = prev
        self.tail.next = None
        self.length -= 1
        if self.length == 0:
            self.head = None
            self.tail = None
        return curr.value
    
    def pop_front(self):
        pass


    def print_list(self):
        curr = self.head
        while curr:
            print(curr.value)
            curr = curr.next
    

lls = LinkedList(10)
# lls.append(20)
# lls.append(30)
lls.pop()
lls.prepend(100)
lls.print_list()