class HashTable:
    def __init__(self, size = 7):
        self.data_map = [None] * size

    def __hash__(self, key):
        my_hash = 0
        for letter in key:
            my_hash = (my_hash + ord(letter) * 23) % len(self.data_map)
        return my_hash
    
    def set_item(self, key, value):
        index = self.__hash__(key)
        if self.data_map[index] == None:
            self.data_map[index] = []
        self.data_map[index].append([key, value])

    def get_item(self, key):
        index = self.__hash__(key)
        if self.data_map[index] == None:
            return None
        for item in self.data_map[index]:
            if item[0] == key:
                return item[1]
        return None
    
    def keys(self):
        keys_list = []
        for i in range(len(self.data_map)):
            if self.data_map[i]:
                for j in range(len(self.data_map[i])):
                    keys_list.append(self.data_map[i][j][0])
        return keys_list
    
    def print_table(self):
        for idx, value  in enumerate(self.data_map):
            print(idx, ": ", value)

ht = HashTable()
ht.set_item("grapes", 10000)
ht.set_item("apples", 100)
ht.set_item("oranges", 10)
ht.set_item("bananas", 1)
print() 
print(ht.get_item("grapes"))
print()
print(ht.keys())
# ht.print_table()