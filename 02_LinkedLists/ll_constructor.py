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
        if self.length == 0:
            return None
        curr = self.head
        self.head = self.head.next
        curr.next = None
        self.length -= 1
        if self.length == 0:
            self.head = None
            self.tail = None
        return curr.value
    
    def get(self, index):
        if index < 0 or index >= self.length:
            return None
        curr = self.head
        idx = 0
        while idx != index:
            curr = curr.next
            idx += 1
        return curr
    
    def set_value(self, index, value):
        temp = self.get(index)
        if temp:
            temp.value = value
            return True
        return False
    
    def insert(self, index, value):
        if index < 0 or index >= self.length:
            return False
        if index == 0:
            return self.prepend(value)
        if index == self.length:
            return self.append(value)
        new_node = Node(value)
        temp = self.get(index-1)
        new_node.next = temp.next
        temp.next = new_node
        self.length += 1
        return True

    def remove(self, index):
        pass

    def print_list(self):
        curr = self.head
        while curr:
            print(curr.value)
            curr = curr.next

lls = LinkedList(10)
lls.print_list()
lls.append(5)
print(lls.get(0))
print(lls.set_value(1,55))
lls.insert(1, 22)
lls.print_list()
