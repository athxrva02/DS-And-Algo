class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class BST:
    def __init__(self) -> None:
        self.root = None

    def insert(self, value):
        newNode = Node(value)
        if not self.root:
             self.root = newNode
             return True
        else:
            curr = self.root
            while True:
                if newNode == curr:
                    return False
                if newNode.value < curr.value:
                    if curr.left == None:
                        curr.left = newNode
                        return True
                    curr = curr.left
                else:
                    if curr.right == None:
                        curr.right = newNode
                        return True
                    curr = curr.right
    def lookup(self, value):
        if self.root == None:
            return False
        curr = self.root
        while True:
            if curr == None:
                return False
            if curr.value == value:
                return True
            elif value < curr.value:
                curr = curr.left
            else:
                curr = curr.right



tree = BST()
tree.insert(10)
tree.insert(5)
tree.insert(15)
tree.insert(2)
tree.insert(12)
print(tree.root.value)
print(tree.root.left.value)
print(tree.root.right.value)
print(tree.lookup(22))