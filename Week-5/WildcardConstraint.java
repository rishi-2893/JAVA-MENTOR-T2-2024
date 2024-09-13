class Linkedlist<T>{
    T a;
}

class A{
}

class B extends A{
}

public class WildcardConstraint {
    public static void func(Linkedlist<?  extends A> obj){
        
    }

    public static void main(String[] args) {
        Linkedlist<Integer> ll = new Linkedlist<>();
    }
}
