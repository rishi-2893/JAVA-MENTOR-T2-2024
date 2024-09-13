class MyClass<T>{
    T obj;

    MyClass(T value){
        this.obj = value;
    }

    // You can use this T anywhere inside this CLASS 
    public T func(){
        return obj;
    }
}

public class WildCard {
    public static void printObj(MyClass<?> obj){
        obj.func();
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        MyClass<?> mc = new MyClass<Integer>(12);
        printObj(mc);
    }
}