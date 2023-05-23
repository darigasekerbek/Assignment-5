public class Main {
    public static void main(String[] args) {
        BinarSearchTree<Integer, String> b_tree = new BinarSearchTree<>();
        b_tree.put(1, "One");
        b_tree.put(2, "Two");
        b_tree.put(3, "Three");
        b_tree.put(4, "Four");
        b_tree.put(5, "Five");
        for (BinarSearchTree.Entry<Integer,String> entry : b_tree){
            System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());
        }
        b_tree.delete(3);
        System.out.println("Binary tree after delete");
        for (BinarSearchTree.Entry<Integer,String> entry : b_tree){
            System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());
        }
        int h = b_tree.getHeight();
        System.out.println("Height of binary tree is " + h);
    }
}