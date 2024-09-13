class A{
    public String toString(){
        return "from A";
    }
}
class B{
    public String toString(){
        return "from B";
    }
}

public class ExtendsExample {
    public static <S extends T, T> void arraycopy(S[] src, T[] target) {
        int i, limit; 
        limit = Math.min(src.length, target.length);
    
        for(i = 0; i < limit; ++i) {
            target[i] = src[i];
        }
    }
    public static void main(String[] args) {
        B[] src = {new B(), new B()};
        A[] target = {new A(), new A()};
        arraycopy(src, target);
        for (A t : target){
            System.out.println(t);
        }
    }
}


// Lets say T is of type Number. I am putting a constraint that S should 
// be of type Number or its descendant. S can be a Integer[] or it can be 
// Double[]