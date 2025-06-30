class Node:
    def __init__(self, value):
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
        curr = self.root
        while True:
            if newNode.value == curr.value:
                return False
            elif newNode.value < curr.value:
                if curr.left == None:
                    curr.left = newNode
                    return True
                curr = curr.left
            else:
                if curr.right == None:
                    curr.right = newNode
                    return True
                curr = curr.right

    def _r_insert(self, current_node, value):
        if current_node == None:
            return Node(value)
        if value < current_node.value:
            current_node.left = self._r_insert(current_node.left, value)
        else:
            current_node.right = self._r_insert(current_node.right, value)
        return current_node
        

    def r_insert(self, value):
        if self.root == None:
            self.root = Node(value)
        self._r_insert(self.root, value)

    def _r_contains(self, current_node, value):
        if current_node == None:
            return False
        if value ==  current_node.value:
            return True
        if value < current_node.value:
            return self._r_contains(current_node.left, value)
        else:
            return self._r_contains(current_node.right, value)
    
    def r_contains(self, value):
        return self._r_contains(self.root, value)


tree = BST()
tree.insert(10)
tree.insert(5)
tree.insert(15)
tree.insert(2)
tree.insert(12)
print(tree.r_contains(15))