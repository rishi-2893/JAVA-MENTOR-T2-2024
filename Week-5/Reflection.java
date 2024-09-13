import java.io.File;
import java.lang.reflect.*;

class Sample{
    private int pvt;
    public String name;

    Sample(){
        pvt=0;
        name="0";
    }

    Sample(int num, String nm){
        this.name = nm;
        this.pvt = num;
    }

    public void func(){
        System.out.println("Nothing");
    }
    public void func2(){
        System.out.println("Nothing from Func2");
    }

    private void funcPVT(){
        System.out.println("Also prints Nothing");
    }
}

public class Reflection {
    public static void main(String[] args) {
        Sample o = new Sample();
        Class c = o.getClass();
        Method[] methods = c.getDeclaredMethods();
        Constructor[] constructors = c.getConstructors();
        Field[] fields = c.getFields();

        System.out.println(methods.length);
        for(Method m : methods){
            try {
                m.invoke(o);
            } catch (Exception e) {
            }
        }
    }
}
