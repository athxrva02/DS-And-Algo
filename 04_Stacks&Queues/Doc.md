# Stack Constructor:
This code defines a Stack class which contains a Node class that is used to store the values in the stack, and provides methods to add and remove items from the stack.

The Node class has two attributes: value, which stores the value of the node, and next, which is a reference to the next node in the linked list.

The Stack class has three methods:

init(self,value): initializes a new Stack object with the value passed in. It creates a new Node object with the value and sets the Stack's top to point to it. The height is set to 1.
push(self,value): adds a new node to the top of the stack containing the value passed in, and updates the height attribute. It does so by creating a new Node object, setting its next attribute to the current top, and then updating the top to point to the new node.
pop(self): removes the top node from the stack and returns it. It does so by updating the top attribute to point to the next node, and decrementing the height attribute. If there are no nodes left on the stack it returns None.

The print_stack method iterates through the stack and prints each node's value, starting from the top.

Lastly, the code creates a new Stack object with an initial value of 10, and calls the push method three times before printing the stack. It then calls the pop method once, prints the stack again, and exits.


# Queue Constructor:

This code defines a Queue class that enables you to store values in a queue, add and remove items from the queue, and print the values in a queue. The Queue class contains a Node class having two attributes: value and next. The value attribute stores the value in the Node, and the next attribute is a reference to the next node in the queue.

The class methods include:

init(self,value): creates a new Queue object with the value passed in, initializes it with a new Node object with the value and sets the Queue's first and last attributes to point to it, and sets the length to 1.
print_queue(self): iterates through the queue and prints each node's value, starting from the first.
enqueue(self,value): adds a new node at the end of the queue with the value passed in, updates the length attribute accordingly. If the queue is empty when the node is added, the first and last attributes of the queue are set to the new node.
dequeue(self): removes the first node from the queue and returns it. It does so by updating the first attribute to the next node, decrementing the length attribute. If there are no nodes left on the queue, it returns None.

The code creates an instance of the Queue class with an initial value of 10, enqueues two values to the queue, and prints the queue. The dequeue method is then called to remove the first value from the queue and prints the queue again.