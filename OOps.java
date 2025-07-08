class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printInfo(String name){
        System.out.println(name);

    }
    public void printInvfvo(int age){
        System.out.println(age);
        
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class OOps {
    public static void main(String args[]){
        Pen pen1 =new Pen();
        pen1.color="blue";
        pen1.type="gel";
        
    
    Pen pen2=new Pen();
    pen2.color="red";
    pen2.type="ball";
    pen2.write();
    pen1.printColor();
    pen2.printColor();
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Deepanshu";
        s1.roll=101;    
        s1.printInfo(s1.name, s1.roll);

    }

    
}
