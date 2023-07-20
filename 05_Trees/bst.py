class Node:
    def __init__(self, value) -> None:
        self.value = value
        self.left = None
        self.right = None

class BST:
    def __init__(self):
        self.root = None

    def insert(self, value):
        newNode = Node(value)
        if not self.root:
            self.root = newNode
            return True
        else:
            curr = self.root
            while True:
                if newNode.value == curr.value:
                    return False
                if newNode.value < curr.value:
                    if curr.left == None:
                        curr.left = newNode
                        return True
                    else:
                        curr = curr.left
                else:
                    if curr.right == None:
                        curr.right = newNode
                        return True
                    else:
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

    

