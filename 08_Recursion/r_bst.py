class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
class BST:
    def __init__(self):
        self.root = None

    def __r_contains(self, curr, value):
        if curr == None:
            return False
        if curr.value == value:
            return True
        if curr.value > value:
            return self.__r_contains(curr.left, value)
        else:
            return self.__r_contains(curr.right, value)
        
    def r_contains(self, value):
        return self.__r_contains(self.root, value)
    

    def __r_insert(self, curr, value):
        if curr == None:
            return Node(value)
        if value < curr.value:
            curr.left = self.__r_insert(curr.left, value)
        else:
            curr.right = self.__r_insert(curr.right, value)
        return curr
    
    def r_insert(self, value):
        if self.root == None:
            self.root = Node(value)
        self.__r_insert(self.root, value)

    def __r_delete(self, curr, value):
        if curr == None:
            return None
        if value < curr.value:
            curr.left = self.__r_delete(curr.left, value)
        elif value > curr.value:
            curr.right = self.__r_delete(curr.right, value)
        else:
            if curr.left == None and curr.right == None:
                return None
            elif curr.left == None:
                curr = curr.right
            elif curr.right == None:
                curr = curr.left
            else:
                sub_tree_min = self.min_value(curr.right)
                curr.value = sub_tree_min
                curr.right = self.__r_delete(curr.right, sub_tree_min)
        return curr
    

    def min_value(self, curr):
        while curr.left != None:
            curr = curr.left
        return curr.value