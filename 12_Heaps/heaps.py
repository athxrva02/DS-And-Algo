class MaxHeap:
    def __init__(self) -> None:
        self.heap = []

    def _left_child(self, index): # Returns the index of the left child node
        return 2 * index + 1
    
    def _right_child(self, index): # Returns the index of the right child node
        return 2 * index + 2
    
    def _parent(self, index): # Returns the index of the parent node
        return (index - 1) // 2
    
    def _swap(self, index1, index2):
        self.heap[index1], self.heap[index2] = self.heap[index2], self.heap[index1]

    def insert(self, value):
        self.heap.append(value)
        current = len(self.heap) - 1

        while current > 0 and self.heap[current] > self.heap[self._parent(current)]:
            self._swap(current, self._parent(current))
            current = self._parent(current)

    def remove(self):
        if len(self.heap) == 0:
            return None
        if len(self.heap) == 1:
            return self.heap.pop()
        
        max_value = self.heap[0]
        self.heap[0] = self.heap.pop()
        self._sink_down(0)

        return max_value
    
    def _sink_down(self, index):
        max_index = index
        while True:
            left_idx = self._left_child(index)
            right_idx = self._right_child(index)

            if left_idx < len(self.heap) and self.heap[left_idx] > self.heap[max_index]:
                max_index = left_idx

            if right_idx < len(self.heap) and self.heap[right_idx] > self.heap[max_index]:
                max_index = right_idx

            if max_index != index:
                self._swap(index, max_index)
                index = max_index
            else:
                return


heap = MaxHeap()
heap.insert(95)
heap.insert(75)
heap.insert(80)
heap.insert(55)
heap.insert(60)
heap.insert(50)
heap.insert(65)

print(heap.heap)
print(heap.remove())
print(heap.heap)