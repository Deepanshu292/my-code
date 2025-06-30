public class Recursion7{
    public static int countPaths(int i,intj,int n,int m){
        if(i==n|| j==m){
            return 0; // Out of bounds
        if(i==n-1&& j==m-1){
            return 1; // Reached the destination
        }
        int downPaths=countPaths(i+1,j,n,m);
        int rightPaths=countPaths(i,j+1,n,m);
        return downPaths + rightPaths;

    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        countPaths(0,0,n,m);
        System.out.println("Total paths from (0,0) to (" + (n-1) + "," + (m-1) + "): " + countPaths(0, 0, n, m));
    }
}