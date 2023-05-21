public class BinarSearchTree <K extends Comparable<K>, V> implements Iterable<BinarSearchTree.Entry<K, V>> {
    private Node root;
    private int size;
    public void put (K key, V value){
        root = putNode(root, key, value);
    }
    private Node putNode(Node node, K key, V value){
        if (node == null){
            size++;
            return new Node(key,value);
        }
    }
    //Node class represent a node in a binary tree ds.
    //It stores a key, value pair and references to its left and right child nodes
    private class Node{
        private K key;
        private V value;
        private Node left;
        private Node right;
        public Node( K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
