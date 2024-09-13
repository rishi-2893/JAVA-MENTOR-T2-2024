class A{
    void m1(){System.out.println("m1 from A");}
    void m2(){System.out.println("m2 from A");}
}
class B extends A{
    void m1(){System.out.println("m1 from B");}
    void m3(){System.out.println("m3 from B");}
}
class C extends B{
    void m1(){System.out.println("m1 from C");}
}

public class WorkAroundInheritance {
    public static void main(String[] args){
        A c = new A();
        c.m1(); // A's m1
    }
}