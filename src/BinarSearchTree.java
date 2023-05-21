import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class BinarSearchTree <K extends Comparable<K>, V> implements Iterable<BinarSearchTree.Entry<K, V>> {
    private Node root;
    private int size;
    public void put (K key, V value){
        root = putNode(root, key, value);
    }
    private Node putNode(Node node, K key, V value){
        //If current node is null, create a new node with given key and value
        if (node == null){
            size++;
            return new Node(key,value);
        }
        //Compare given key with key of current node
        int comparison = key.compareTo(node.key);
        if (comparison > 0){
            node.right = putNode(node.right, key, value);
        }
        else if (comparison < 0){
            node.left = putNode(node.left, key, value);
        }
        else {
            node.value = value;
        }
        //return modified node
        return node;
    }
    public V get(K key){
        Node node = getNode(root, key);
        return node != null ? node.value : null;
    }
    //This method search for a node with given key in tree
    //returns the node if found, or null if the key isn't present
    private Node getNode(Node node, K key){
        while (node != null){
            int comparison = key.compareTo(node.key);
            if(comparison > 0){
                node = node. right;
            }
            else if (comparison < 0){
                node = node.left;
            }
            else {
                return node;
            }
        }
        return null;
    }
    public int size(){
        return size;
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return new InOrderIterator();
    }
    static class Entry <K,V>{
        private K key;
        private V value;
        public Entry ( K key, V value){
            this.key = key;
            this.value = value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
    // Node class represent a node in a binary tree ds.
    // It stores a key, value pair and references to its left and right child nodes
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
    private class InOrderIterator implements Iterator<Entry<K, V>> {
        private Stack<Node> stack;
        public InOrderIterator(){
            stack = new Stack<>();
            pushLeftN(root);
        }
        private void pushLeftN(Node node){
            while (node != null){
                stack.push(node);
                node = node.left;
            }
        }
        public boolean hasNext(){
            return !stack.isEmpty();
        }
        public Entry<K, V> next(){
            if (!hasNext()){
                throw new NoSuchElementException("No more element");
            }
            Node curr = stack.pop();
            pushLeftN(curr.right);
            return new Entry<>(curr.key, curr.value);
        }
    }
}
