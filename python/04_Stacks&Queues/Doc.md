# Stack Class

This code defines a Stack class, which is a data structure that follows the Last-In-First-Out (LIFO) principle. The code initializes the class with a single value and creates a Node class which contains elements to be used in creating the stack.

## Class Node:

The Node class contains two attributes, value- to store the value of the node and next- which is a reference to the next node in the Stack. The __init__ method of the class initializes the attributes to their default values, with next set as None.

## Class Stack:

The Stack class contains various methods to operate on the stack. The __init__ method initializes the class with a single initial value, creates a new node and sets top to refer to it. The height attribute tracks the number of nodes in the stack.

The push method adds a new node to the top of the stack with the value passed in as an argument. If the stack is empty, it creates a new node and sets the top attribute to refer to it. If the stack is not empty, it creates a new node, sets its reference to the current top node, and updates the top attribute.

The pop method removes the top node from the stack and returns it. It does so by updating the top attribute to refer to the next node, decrementing the height attribute, and returning the popped node. If the stack is empty before calling the pop method, it returns None.

The print_stack method iterates through the stack, starting from the top, and prints the value of each node.

The code creates an instance of Stack class with an initial value of 10, adds three more values to the stack using the push method, and prints the stack. Then it removes and returns the last node from the stack using the pop method, prints the stack again.


# Queue Constructor:

This code defines a Queue class that enables you to store values in a queue, add and remove items from the queue, and print the values in a queue. The Queue class contains a Node class having two attributes: value and next. The value attribute stores the value in the Node, and the next attribute is a reference to the next node in the queue.

The class methods include:

init(self,value): creates a new Queue object with the value passed in, initializes it with a new Node object with the value and sets the Queue's first and last attributes to point to it, and sets the length to 1.
print_queue(self): iterates through the queue and prints each node's value, starting from the first.
enqueue(self,value): adds a new node at the end of the queue with the value passed in, updates the length attribute accordingly. If the queue is empty when the node is added, the first and last attributes of the queue are set to the new node.
dequeue(self): removes the first node from the queue and returns it. It does so by updating the first attribute to the next node, decrementing the length attribute. If there are no nodes left on the queue, it returns None.

The code creates an instance of the Queue class with an initial value of 10, enqueues two values to the queue, and prints the queue. The dequeue method is then called to remove the first value from the queue and prints the queue again.