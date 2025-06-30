public class Recursion8 {
    public static int placeTiles(int n,int m){
        if(n==m  ){
            return 2;

        }
        if(n<m){
            return 1;
        }
        int vertPlacements =placeTiles(n-m,m);
        int horizPlacements =placeTiles(n-1,m); 
        return vertPlacements + horizPlacements;

    }
    public static void main(String args[]){
        int n=4,m=2;
        System.out.println(placeTiles(n, m));
    }

    
}
