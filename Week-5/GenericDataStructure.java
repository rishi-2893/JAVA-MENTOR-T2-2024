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

public class GenericDataStructure {
    public static void main(String[] args) {
        MyClass<Integer> mc = new MyClass<>(13);
        System.out.println(mc.func());
    }
}
