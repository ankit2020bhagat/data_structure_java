package lambda;


interface FuncInterface{
    void abstractFunc(int x);
    default void normalFun(){
        System.out.println("Hello");
    }
}
public class FunctionalInterface {

    public static void main(String[] args) {
        FuncInterface fun =(a)-> System.out.println(a*10);

        fun.abstractFunc(13);
        fun.normalFun();
    }
}
