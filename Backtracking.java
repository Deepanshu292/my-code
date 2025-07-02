public class Recursion7 {
    public static void printSubsets(String str, String subset, int idx) {
        if (idx == str.length()) {
            System.out.println(subset);
            return;
        }
        
        // Exclude the current character
        printSubsets(str, subset, idx + 1);
        
        // Include the current character
        printSubsets(str, subset + str.charAt(idx), idx + 1);
    }
    
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);
    