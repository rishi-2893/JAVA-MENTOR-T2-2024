public class PrivateVariableExample{
    static private int install = 0;

    PrivateVariableExample(){
        install++;
    }

    public static void main(String[] args){
        PrivateVariableExample p = new PrivateVariableExample();
        PrivateVariableExample p1= new PrivateVariableExample();
        PrivateVariableExample p2 = new PrivateVariableExample();
        PrivateVariableExample p3 = new PrivateVariableExample();
        System.out.println(PrivateVariableExample.install);
    }
}