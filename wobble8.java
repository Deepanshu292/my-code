public class wobble8 {
    
    

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // end of word
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root; 
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
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
    public static String ans ="";
    public static void longestWord(Node root ,StringBuilder temp){
        if(root ==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i] != null && root.children[i].eow ==true){
                temp.append((char)(i+'a'));
                if(temp.length()> ans.length()){
                    ans =temp.toString();
                }
                longestWord(root.children[i],temp);

                temp.deleteCharAt(temp.length()-1);

            }
        }
    }

    public static boolean startswith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count + 1; // count this node + children
    }

    public static void main(String[] args) {
        String words[] = {"a","banana","app","appl","ap","apply","apple"};
        for (int i = 0; i < words.length; i++) {
        
            insert(words[i]);
        }
        longestWord(root ,new StringBuilder(""));
        System.out.println(ans);
    }

    


    
}
