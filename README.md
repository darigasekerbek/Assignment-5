# Binary Search Tree Implementation

The `BinarySearchTree` class represents an efficient **binary search tree** data structure, enabling operations like **insertion**, **retrieval**, and **deletion** of key-value pairs. The tree maintains a sorted structure, with smaller keys placed on the left and larger keys on the right.

### Entry Class
The `Entry` class encapsulates a **key-value pair**, which is stored in the binary search tree.

### Node Class
The `Node` class represents an individual **node** in the binary search tree. Each node holds a key-value pair and references to its left and right child nodes.

### InOrderIterator Class
The `InOrderIterator` class implements the **Iterator** interface to enable **in-order traversal** of the key-value pairs within the binary search tree.

### Methods:

- **`delete(K key)`**: Removes the node associated with the given key from the binary search tree.
- **`size()`**: Returns the total number of key-value pairs stored in the binary search tree.
- **`get(K key)`**: Retrieves the value associated with the specified key from the binary search tree.
