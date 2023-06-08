class Node:
    def __init__(self, value):
        self.value = value
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self, value):
        newNode = Node(value)
        self.head = newNode
        self.tail = newNode
        self.length = 1

    def print_list(self):
        curr = self.head
        while curr:
            print(curr.value)
            curr = curr.next

    def append(self, value):
        if not self.head:
            newNode = Node(value)
            self.head = newNode
            self.tail = newNode
        else:
            temp = Node(value)
            self.tail.next = temp
            temp.prev = self.tail
            self.tail = temp
        self.length += 1
        return True
            


DLL = DoublyLinkedList(10)
DLL.append(5)
DLL.append(16)
DLL.print_list()