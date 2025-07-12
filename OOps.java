import java.util.*;
import bank;
import java.util.prefs.BackingStoreException;
class Shape{

    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{

    public void area(int l ,int h){
        System.out.println("displays area of triangle:"1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void arae(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println("displays area of circle:" + (3.14)*r*r);
    }
}

public class OOPS{
    public static void main(String args[]){
        BackingStoreException.Account account 1=new BackingStoreException.Account();
        account1.name="customer1";

    }
}