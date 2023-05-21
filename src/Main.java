public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(1, "Val 56"); // Insert key-value pair (1, "Val 56")
        bst.put(2, "Val 23"); // Insert key-value pair (2, "Val 23")
        bst.put(4, "Val 15"); // Insert key-value pair (4, "Val 15")
        bst.put(3, "Val 20"); // Insert key-value pair (3, "Val 20")
        bst.put(5, "Val 42"); // Insert key-value pair (5, "Val 42")
        bst.put(6, "Val 30"); // Insert key-value pair (6, "Val 30")
        bst.put(7, "Val 99"); // Insert key-value pair (7, "Val 99")

        System.out.println("Value for key 1: " + bst.get(1)); // Retrieve value for key 1 and print

        bst.delete(5); // Delete key 5 from the tree

        System.out.println("Size of the tree: " + bst.size()); // Print the size of the tree

        System.out.println("Keys in ascending order:"); // Print the keys in ascending order
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }
    }
}
