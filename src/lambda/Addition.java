package lambda;

interface Add{
    int addition(int a,int b);
}

public class Addition {

    public static void main(String[] args) {
        Add add  = (a,b) -> a+b;

        int result = add.addition(2,4);

        System.out.println("result "+result);
    }
}
