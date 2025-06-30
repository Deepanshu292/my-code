public class Recursion9 {
    public static int countWays(int n) {
    if(n<=1);
    return 1;
    }
    int ways1=countWays(n-1);
    int ways2=countWays(n-2)*(n-1);
    return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 4; // Example input
        System.out.println("Number of ways to arrange " + n + " people: " + countWays(n));
    }


    


    
}


