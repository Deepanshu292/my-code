public class wobble3 {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node root = wobble3.root; // Use a local variable to traverse
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (root.children[idx] == null) {
                root.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                root.children[idx].eow = true;
            }
            root = root.children[idx];
        }
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "answer"};
        for (String word : words) {
            insert(word);
        }
    }
}
