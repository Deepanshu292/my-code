
public class wobble3 {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // end of word
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root; // Use a local variable to traverse
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx]; // ✅ FIXED typo: "curt" → "curr"
        }
    }

    public static boolean search(String key) { // ✅ FIXED: Removed stray '}'
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            if (i == key.length() - 1 && !curr.children[idx].eow) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "answer"};
        for (String word : words) {
            insert(word);
        }
        System.out.println(search("the"));   // true
        System.out.println(search("these")); // false
        System.out.println(search("a"));     // true
        System.out.println(search("answer")); // true
        System.out.println(search("any"));    // false
    }
}
